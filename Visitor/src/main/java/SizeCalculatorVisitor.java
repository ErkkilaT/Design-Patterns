public class SizeCalculatorVisitor implements FileSystemVisitor{
    private int totalSize;
    public SizeCalculatorVisitor(){
        totalSize = 0;
    }
    public void visit(File file){
        totalSize += file.getSize();
    }
    public void visit(Directory directory){
        for(File f : directory.getFiles()){
            visit(f);
        }
        for(Directory d : directory.getDirectories()){
            visit(d);
        }
    }

    public int getTotalSize(){
        return totalSize;
    }
}
