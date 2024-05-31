public class File implements Data {
    private String name;
    public File(String name) {
        this.name = name;
    }
    public void display( String indent) {
        System.out.println( indent + name);
    }
}
