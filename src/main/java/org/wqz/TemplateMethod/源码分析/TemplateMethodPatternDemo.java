package org.wqz.TemplateMethod.源码分析;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// 定义 Jdbc 模板类
abstract class JdbcTemplate {
    // 模板方法，封装了数据库操作的基本流程
    public final void executeQuery(String sql) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            // 获取数据库连接
            conn = getConnection();
            // 创建预编译语句
            stmt = conn.prepareStatement(sql);
            // 执行查询
            rs = stmt.executeQuery();
            // 处理查询结果
            handleResultSet(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            closeResources(conn, stmt, rs);
        }
    }

    // 获取数据库连接的抽象方法，由子类实现
    protected abstract Connection getConnection() throws SQLException;

    // 处理查询结果的抽象方法，由子类实现
    protected abstract void handleResultSet(ResultSet rs) throws SQLException;

    // 关闭资源的方法
    private void closeResources(Connection conn, PreparedStatement stmt, ResultSet rs) {
        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

// 实现 Jdbc 模板类的具体子类
class ConcreteJdbcTemplate extends JdbcTemplate {
    @Override
    protected Connection getConnection() throws SQLException {
        // 这里简单模拟获取数据库连接
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "password");
    }

    @Override
    protected void handleResultSet(ResultSet rs) throws SQLException {
        while (rs.next()) {
            System.out.println(rs.getString(1));
        }
    }
}

// 测试模板方法模式
public class TemplateMethodPatternDemo {
    public static void main(String[] args) {
        JdbcTemplate jdbcTemplate = new ConcreteJdbcTemplate();
        jdbcTemplate.executeQuery("SELECT * FROM users");
    }
}