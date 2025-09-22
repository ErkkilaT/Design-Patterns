public class File implements FileSystemElement{
    private int size;
    private String name;
    public File(String name, int size){
        this.name = name;
        this.size = size;
    }
    public int getSize(){
        return size;
    }
    public String getName(){
        return  name;
    }

    public void accept(FileSystemVisitor visitor){
        visitor.visit(this);
    }
}
