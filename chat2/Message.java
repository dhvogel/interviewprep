package chat2;

import java.util.*;

enum MessageType {
    TEXT, MEDIA
}

public class Message {
    enum MessageStatus {
        SENT, DELIVERED, READ
    }

    final String content;
    final User sender;
    final Date timeSent;
    final MessageStatus status;
    final MessageType type;

    public Message(String content, User sender, Date timeSent, MessageStatus status, MessageType type) {
        this.content = content;
        this.sender = sender;
        this.timeSent = timeSent;
        this.status = status;
        this.type = type;
    }

}
