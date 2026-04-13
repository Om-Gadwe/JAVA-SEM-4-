package minichatapp.model;

public class Message {
    private String sender;
    private String content;

    public Message(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }

    public String format() {
        return sender + ": " + content;
    }
}