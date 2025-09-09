public class Main {
    public static void main(String[] args) {
        FeedbackHandler feedbackHandler;

        FeedbackHandler generalHandler = new GeneralHandler();
        FeedbackHandler suggestionsHandler = new SuggestionsHandler();
        FeedbackHandler contactHandler = new ContactHandler();
        FeedbackHandler compensationHandler = new CompensationHandler();
        generalHandler.setNextHandler(suggestionsHandler);
        suggestionsHandler.setNextHandler(contactHandler);
        contactHandler.setNextHandler(compensationHandler);
        feedbackHandler = generalHandler;

        Message m1 = new Message(MessageType.COMPENSATION,"You break my shit your pay", "viljo@viljo.fi" );
        Message m2 = new Message(MessageType.GENERAL,"Very good jobs!","matti@matti.fi");
        Message m3 = new Message(MessageType.SUGGESTIONS, "Make better site dumdum!", "vesa@vesa.fi");
        feedbackHandler.handle(m1);
        System.out.println("\n\n");
        feedbackHandler.handle(m2);
        System.out.println("\n\n");
        feedbackHandler.handle(m3);
    }


}
