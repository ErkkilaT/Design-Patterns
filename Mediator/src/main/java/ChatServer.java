import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatServer {
    private static ChatServer instance;
    private static Map<String,Controller> clients;
    private ChatServer(){
        clients = new HashMap<>();
    }
    public static ChatServer getInstance(){
        if(instance == null){
            instance = new ChatServer();
        }
        return instance;
    }

    public void deliverMessage(String recipient,String sender, String message){
        clients.get(recipient).receiveMessage(sender,message);
    }

    public void addClient(Controller controller){
        clients.put(controller.getUsername(), controller);
    }
    public List<String> getClientList(){
        List<String> list = new ArrayList<>(clients.keySet());
        return list;
    }


}
