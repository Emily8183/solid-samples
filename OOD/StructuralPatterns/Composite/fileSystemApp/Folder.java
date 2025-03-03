//composite: 非叶子节点，用于存储子部件，在component接口中实现子部件的具体相关操作，例如增加add(), 删除remove()等
import java.util.List;
import java.util.ArrayList;

public class Folder implements FileSystemComponent{
    private String name;

    private List<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent fileSystemComponent) {
        components.add(fileSystemComponent);
    }
    
    public void removeComponent(FileSystemComponent fileSystemComponent) {
        components.remove(fileSystemComponent);
    }

    @Override
    public void showDetails() {
        System.out.println("Folder " + name);

        for (FileSystemComponent fileSystemComponent:components) {
            fileSystemComponent.showDetails();
        }
    }

}
