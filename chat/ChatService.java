import java.util.*;

interface ChatService {
    Conversation createConversation(List<User> participants);

    void sendMessage(String convoId, User sender, String text, MessageType type);

    void markAsRead(String convoId, User reader);

    List<Conversation> getConversationsFor(User user);
}
