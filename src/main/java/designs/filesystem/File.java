package designs.filesystem;

public class File extends FileSystem {
    public File(String name) {
        super(FileSystemType.FILE, name);
    }

    @Override
    void ls() {
        throw new UnsupportedOperationException("You are inside a file, it does not have sub directories");
    }

    @Override
    FileSystemType getType() {
        return FileSystemType.FILE;
    }

    @Override
    void addChild(FileSystem child) {
        throw new UnsupportedOperationException("You are inside a file, cannot add child");
    }
}
