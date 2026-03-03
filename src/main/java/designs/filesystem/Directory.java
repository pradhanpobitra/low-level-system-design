package designs.filesystem;

public class Directory extends FileSystem {
    @Override
    void addChild(FileSystem child) {
        this.children.add(child);
    }

    public Directory(String name) {
        super(FileSystemType.DIRECTORY, name);
    }

    @Override
    public void ls() {
        System.out.println("Inside " + getName());
        for(FileSystem fs : children) {
            System.out.println(fs.getName() + ", type: " +  fs.getType() + "\n");
        }
    }

    @Override
    FileSystemType getType() {
        return FileSystemType.DIRECTORY;
    }
}
