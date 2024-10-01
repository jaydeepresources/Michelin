package simple;

public class Message {

    private String messageText;

    public Message() {
        System.out.println("DC");
    }

    public Message(String messageText) {
        System.out.println("PC");
        this.messageText = messageText;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        System.out.println("Setter");
        this.messageText = messageText;
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageText='" + messageText + '\'' +
                '}';
    }
}
