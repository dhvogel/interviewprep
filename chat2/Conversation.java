package chat2;

import java.util.*;

public class Conversation {

    final List<Message> messages = new ArrayList<>();
    final List<User> participants;
    final String id;

    public Conversation(List<User> participants, String id) {
        this.participants = participants;
        this.id = id;
    }

    void addMessage(Message message) {
        messages.add(message);
    }
}
