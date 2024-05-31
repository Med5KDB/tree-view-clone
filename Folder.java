import java.util.ArrayList;
import java.util.List;

public class Folder implements Data {
    private String name;
    private List<Data> childComponents;

    public Folder(String name) {
        this.name = name;
        this.childComponents = new ArrayList<Data>();
    }
    public void display(String indent) {
        System.out.println(indent + name);
        
        for (Data data : childComponents) {
            data.display(indent + "|  ");
        }
    }
    public void addChildComponents(Data component){
        this.childComponents.add(component);
    }
    public void displayTree() {
        display("");
    }
}
