import java.util.ArrayList;
import java.util.List;

public class ContactHandler extends FeedbackHandler{
    private List<Message> contactRequests = new ArrayList<>();
    public void handle(Message message){
        if(message.getMessageType() == MessageType.CONTACT){
            contactRequests.add(message);
            System.out.println("ContactHandler: Your contact request has been forwarded to the appropriate department and we will be in contact shortly.");
        }else{
            System.out.println("ContactHandler: not a contact request");
            super.handle(message);
        }
    }
}
