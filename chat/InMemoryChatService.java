import java.util.*;

class InMemoryChatService implements ChatService {
    private final Map<String, Conversation> conversations = new HashMap<>();

    @Override
    public Conversation createConversation(List<User> participants) {
        String id = UUID.randomUUID().toString();
        Conversation convo = new Conversation(id, participants);
        conversations.put(id, convo);
        return convo;
    }

    @Override
    public void sendMessage(String convoId, User sender, String text, MessageType type) {
        Message msg = new Message(UUID.randomUUID().toString(), sender, text, type);
        Conversation convo = conversations.get(convoId);
        convo.addMessage(msg);
    }

    @Override
    public void markAsRead(String convoId, User reader) {
        Conversation convo = conversations.get(convoId);
        for (Message msg : convo.messages) {
            msg.seenBy.put(reader.id, SeenStatus.READ);
        }
    }

    @Override
    public List<Conversation> getConversationsFor(User user) {
        return conversations.values().stream()
                .filter(c -> c.participants.contains(user))
                .toList();
    }
}
