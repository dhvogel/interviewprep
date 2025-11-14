import java.util.*;

class Conversation {
    final String id;
    final List<User> participants;
    final List<Message> messages = new ArrayList<>();

    Conversation(String id, List<User> participants) {
        this.id = id;
        this.participants = participants;
    }

    void addMessage(Message message) {
        messages.add(message);
    }
}