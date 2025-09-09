import java.util.ArrayList;
import java.util.List;

public class CompensationHandler extends FeedbackHandler{
    private List<Message> compensationRequests = new ArrayList<>();
    public void handle(Message message){
        if(message.getMessageType() == MessageType.COMPENSATION){
            compensationRequests.add(message);
            System.out.println("CompensationHandler: Your compensation request has been forwarded to the claims department and they will be in contact shortly.");
        }else{
            System.out.println("CompensationHandler: not a compensation request");
            super.handle(message);
        }
    }
}
