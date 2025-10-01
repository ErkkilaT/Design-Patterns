import javafx.scene.control.TextArea;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Controller {
    private Client client;
    private ChatServer server;
    private View view;
    private String currentChat;
    private TextArea currentChatArea;




    public Controller(String username, View view){
        client = new Client(username);
        server = ChatServer.getInstance();
        this.view = view;

    }
    public void sendMessage(String recipient, String message){
        server.deliverMessage(recipient, client.getUsername() ,message);
        client.sendMessage(recipient,message);
    }
    public void receiveMessage(String sender, String message){
        client.receiveMessage(sender,message);
        if(sender.equals(currentChat)){
            view.updateChatHistory(currentChat, currentChatArea, this);
        }

    }
    public String getUsername(){
        return client.getUsername();
    }
    public List<String> getChatHistory(String username){
        return client.getChatHistory(username);
    }


    public void setCurrentChat(String recipient, TextArea area) {
        currentChat = recipient;
        currentChatArea = area;
    }
}
