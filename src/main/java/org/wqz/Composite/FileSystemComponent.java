package org.wqz.Composite;

// 抽象组件类
abstract class FileSystemComponent {
    protected String name;

    public FileSystemComponent(String name) {
        this.name = name;
    }

    public abstract void showDetails();

    public abstract void add(FileSystemComponent component);

    public abstract void remove(FileSystemComponent component);
}    