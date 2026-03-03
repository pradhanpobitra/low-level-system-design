package designs.filesystem;

import java.util.ArrayList;
import java.util.List;

public abstract class FileSystem {

    private final FileSystemType type;
    private final String name;
    protected final List<FileSystem> children;

    public FileSystem(FileSystemType type, String name) {
        this.type = type;
        this.name = name;
        this.children = new ArrayList<>();
    }

    abstract void ls();

    public String getName() {
        return name;
    }

    abstract FileSystemType getType();

    abstract void addChild(FileSystem child);
}
