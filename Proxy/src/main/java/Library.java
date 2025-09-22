import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<Integer, Document> documents;
    public Library(){
        documents = new HashMap<>();
    }
    public Document createDocument(int id, String contents, User user, boolean isProtected){
        Document doc;
        if(isProtected){
            doc = new DocumentProxy(id, contents, user);
            documents.put(id, doc);
        }
        else{
            doc = new DocumentReal(id, contents);
            documents.put(id, doc);
        }
        return doc;
    }
    public Document getDocument(int id){
        return documents.get(id);
    }
}
