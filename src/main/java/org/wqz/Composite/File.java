package org.wqz.Composite;

// 叶子节点类（文件）
class File extends FileSystemComponent {
    public File(String name) {
        super(name);
    }

    @Override
    public void showDetails() {
        System.out.println("File: " + name);
    }

    @Override
    public void add(FileSystemComponent component) {
        throw new UnsupportedOperationException("Cannot add to a file");
    }

    @Override
    public void remove(FileSystemComponent component) {
        throw new UnsupportedOperationException("Cannot remove from a file");
    }
}    