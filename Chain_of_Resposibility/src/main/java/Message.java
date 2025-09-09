public class Message {
    private MessageType messageType;
    private String messageContent;
    private String eMail;

    public Message(MessageType messageType, String messageContent, String eMail){
        this.messageType = messageType;
        this.messageContent = messageContent;
        this.eMail = eMail;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
}
