import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Client {
    private Map<String, List<String>> chats;
    private String username;
    public Client(String username){
        this.username = username;
        chats = new HashMap<>();
    }
    public String getUsername(){
        return username;
    }
    public void receiveMessage(String sender, String message){
        if(chats.containsKey(sender)){
            chats.get(sender).add(sender + ": " + message);
        }
        else{
            List<String> chat = new ArrayList<>();
            chat.add(sender + ": " + message);
            chats.put(sender, chat);
        }
    }
    public void sendMessage(String recipient, String message){
        if(chats.containsKey(recipient)){
            chats.get(recipient).add(username + ": " + message);
        }
        else{
            List<String> chat = new ArrayList<>();
            chat.add(username + ": " + message);
            chats.put(recipient, chat);
        }
    }
    public List<String> getChatHistory(String username){
        return chats.get(username);
    }
}
