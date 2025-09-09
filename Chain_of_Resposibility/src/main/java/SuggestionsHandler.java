import java.util.ArrayList;
import java.util.List;

public class SuggestionsHandler extends FeedbackHandler{
    private List<String> suggestions = new ArrayList<>();
    public void handle(Message message){
        if(message.getMessageType() == MessageType.SUGGESTIONS){
            suggestions.add(message.getMessageContent());
            System.out.println("SuggestionsHandler: Your suggestions have been saved to our system and will be reviewed. Thank you for your interest.");
        }else{
            System.out.println("SugegstionsHandler: not a suggestion");
            super.handle(message);
        }
    }
}
