package org.wqz.Interpreter;

// 客户端代码
public class InterpreterPatternExample {
    public static void main(String[] args) {
        // 构建表达式 5 + 3 - 2
        Expression five = new NumberExpression(5);
        Expression three = new NumberExpression(3);
        Expression two = new NumberExpression(2);

        Expression add = new AddExpression(five, three);
        Expression subtract = new SubtractExpression(add, two);

        // 解释表达式
        int result = subtract.interpret();
        System.out.println("结果: " + result);
    }
}    