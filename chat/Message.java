import java.util.*;

enum MessageType {
    TEXT, EMOJI, GIF
}

enum SeenStatus {
    SENT, DELIVERED, READ
}

public class Message {
    private final String id;
    final User sender;
    final String content;
    private final MessageType type;
    private final Date timestamp;
    final Map<String, SeenStatus> seenBy = new HashMap<>();

    public Message(String id, User sender, String content, MessageType type) {
        this.id = id;
        this.sender = sender;
        this.content = content;
        this.type = type;
        this.timestamp = new Date();
    }

    // getters...
}