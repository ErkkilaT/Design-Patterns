import java.util.ArrayList;
import java.util.List;

public class GeneralHandler extends FeedbackHandler{
    private List<Message> feedBack = new ArrayList<>();
    @Override
    public void handle(Message message){
        if(message.getMessageType() == MessageType.GENERAL){
            feedBack.add(message);
            System.out.println("GeneralHandler: Thank you for your feedback. Your feedback has been saved and we will respond soon if appropriate =)");
        }else{
            System.out.println("GeneralHandler: Not general feedback");
            super.handle(message);
        }
    }
}
