import java.util.ArrayList;
import java.util.List;

public class Folder extends Data {
    private String name;
    private List<Data> childComponents;

    public Folder(String name) {
        this.name = name;
        this.childComponents = new ArrayList<Data>();
    }
    public void display() {
        System.out.println("Dossier: " + name);
        System.out.println("====Contenu du dossier====");
        for (Data data : childComponents) {
            data.display();
        }
    }
    public void addChildComponents(Data component){
        this.childComponents.add(component);
    }
}
