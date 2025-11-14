package chat2;

import java.util.*;

class ChatServiceImpl implements ChatService {
    private final Map<String, Conversation> conversations = new HashMap<>();

    @Override
    public Conversation createConversation(List<User> participants) {
        String uuid = UUID.randomUUID().toString();
        Conversation conversation = new Conversation(participants, uuid);
        conversations.put(uuid, conversation);
        return conversation;
    }

    @Override
    public void sendMessage(String conversationId, String text, User sender, MessageType type) {
        Conversation conversation = conversations.get(conversationId);
        Message message = new Message(text, sender, null, null, type);
        conversation.addMessage(message);
    }

    @Override
    public void markAsRead(String convoId, User reader) {
        Conversation conversation = conversations.get(convoId);
        for (Message m : conversation.messages) {
            m.setStatus(Mes)
        }
    }

    List<Conversation> getConversationsFor(User user);

}
