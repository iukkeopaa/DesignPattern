package org.wqz.Composite;// 组合节点类（文件夹）
import java.util.ArrayList;
import java.util.List;

class Folder extends FileSystemComponent {
    private List<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public void showDetails() {
        System.out.println("Folder: " + name);
        for (FileSystemComponent component : components) {
            component.showDetails();
        }
    }

    @Override
    public void add(FileSystemComponent component) {
        components.add(component);
    }

    @Override
    public void remove(FileSystemComponent component) {
        components.remove(component);
    }
}    