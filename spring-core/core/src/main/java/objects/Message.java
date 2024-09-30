package objects;

public class Message {

    private String messageText;
    private Receiver receiver;

    public Message() {
        System.out.println("DC");
    }

    public Message(String messageText, Receiver receiver) {
        this.messageText = messageText;
        this.receiver = receiver;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        System.out.println("Setter");
        this.messageText = messageText;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageText='" + messageText + '\'' +
                ", receiver=" + receiver +
                '}';
    }
}
