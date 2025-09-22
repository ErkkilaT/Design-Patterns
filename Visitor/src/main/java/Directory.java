import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemElement{
    private List<File> files;
    private List<Directory> directories;

    private String name;

    public Directory(String name){
        files = new ArrayList<>();
        directories = new ArrayList<>();
        this.name = name;
    }

    public void addFile(File x){
        files.add(x);
    }
    public void addDirectory(Directory x){
        directories.add(x);
    }

    public List<File> getFiles() {
        return files;
    }
    public List<Directory> getDirectories(){
        return directories;
    }

    public void accept(FileSystemVisitor visitor){
        visitor.visit(this);
    }
}
