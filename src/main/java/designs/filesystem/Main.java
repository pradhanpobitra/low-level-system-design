package designs.filesystem;

public class Main {
    public static void main(String[] args) {
        FileSystem dir1 = new Directory("movies");
        FileSystem dir2 = new Directory("comedy - movies");
        FileSystem dir3 = new Directory("thriller - movies");
        FileSystem file1 = new File("Phir Hera Pheri");
        FileSystem file2 = new File("Chup Chup Ke");
        FileSystem file3 = new File("Anabelle");

        dir1.addChild(dir2);
        dir1.addChild(dir3);
        dir2.addChild(file1);
        dir2.addChild(file2);
        dir3.addChild(file3);

        dir1.ls();
        dir2.ls();
        dir3.ls();
    }
}
