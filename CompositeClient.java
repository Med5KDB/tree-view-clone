public class CompositeClient {
    public static void main(String[] args) {
        File file1 = new File("notes.txt");
        File file2 = new File("aksil.txt");

        File file3 = new File("urgences.mp3");
        File file4 = new File("vacances.mp4");

        Folder folder1 = new Folder("Projets");
        Folder folder2 = new Folder("Documents");
        Folder folder3 = new Folder("Images");

        folder1.addChildComponents(file1);
        folder1.addChildComponents(file2);
        folder1.addChildComponents(folder3);

        folder2.addChildComponents(file3);
        folder2.addChildComponents(file4);

        folder3.addChildComponents(new File("photo1.jpg"));

        folder1.displayTree();

        folder2.displayTree();
    }
}
