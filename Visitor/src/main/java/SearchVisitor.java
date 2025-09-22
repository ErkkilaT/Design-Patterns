import java.util.ArrayList;
import java.util.List;

public class SearchVisitor implements FileSystemVisitor{
    private List<File> matches;
    private String searchTerm;

    public SearchVisitor(String searchTerm){
        this.searchTerm = searchTerm;
        matches = new ArrayList<>();
    }



    public void visit(File file){
        if(file.getName().contains(searchTerm)){
            matches.add(file);
        }
    }
    public void visit(Directory directory){
        for(Directory d : directory.getDirectories()){
            visit(d);
        }
        for(File f: directory.getFiles()){
            visit(f);
        }
    }
    public void newSearch(String s){
        matches.clear();
        searchTerm = s;
    }
    public List<File> getMatches(){
        return matches;
    }
}
