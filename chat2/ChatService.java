package chat2;

import java.util.*;

interface ChatService {
    Conversation createConversation(List<User> participants);

    void sendMessage(String conversationId, String text, User sender, MessageType type);

    void markAsRead(String convoId, User reader);

    List<Conversation> getConversationsFor(User user);

}
