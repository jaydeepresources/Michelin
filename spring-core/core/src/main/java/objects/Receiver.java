package objects;

public class Receiver {

    private String receiverName;

    public Receiver() {
    }

    public Receiver(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    @Override
    public String toString() {
        return "Receiver{" +
                "receiverName='" + receiverName + '\'' +
                '}';
    }
}
