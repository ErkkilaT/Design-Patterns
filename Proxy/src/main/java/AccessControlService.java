import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccessControlService {
    private static AccessControlService instance;
    private Map<Integer, ArrayList<String>> access;

    private AccessControlService(){
        access = new HashMap<>();
    }
    public static AccessControlService getInstance(){
        if(instance == null){
            instance = new AccessControlService();
        }
        return instance;
    }

    public boolean isAllowed(String username, int id){
        if(access.get(id) != null){
            for(String s : access.get(id)){
                if(s.equals(username)){
                    return true;
                }
            }
        }
        return false;
    }

    public void addAccessMany(Document doc, ArrayList<String> users){
        if(access.get(doc.getId()) == null){
            access.put(doc.getId(), users);
        }
        else{
            access.get(doc.getId()).addAll(users);
        }
    }
    public void addAccess(Document doc, User user){
        if(access.get(doc.getId()) == null){
            ArrayList<String> users = new ArrayList<>();
            users.add(user.getUsername());
            access.put(doc.getId(), users);
        }
        else{
            access.get(doc.getId()).add(user.getUsername());
        }
    }
}
