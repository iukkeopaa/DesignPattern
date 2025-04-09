package org.wqz.Composite;

// 主类
public class Main {
    public static void main(String[] args) {
        // 创建文件夹和文件
        Folder rootFolder = new Folder("Root");
        Folder subFolder = new Folder("SubFolder");
        File file1 = new File("File1.txt");
        File file2 = new File("File2.txt");
        File file3 = new File("File3.txt");

        // 构建文件系统结构
        subFolder.add(file2);
        subFolder.add(file3);
        rootFolder.add(file1);
        rootFolder.add(subFolder);

        // 显示文件系统详细信息
        rootFolder.showDetails();
    }
}    