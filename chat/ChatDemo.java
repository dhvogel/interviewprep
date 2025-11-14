import java.util.List;

public class ChatDemo {
    public static void main(String[] args) {
        ChatService service = new InMemoryChatService();

        User alice = new User("1", "Alice");
        User bob = new User("2", "Bob");

        Conversation c = service.createConversation(List.of(alice, bob));

        service.sendMessage(c.id, alice, "Hey Bob 👋", MessageType.TEXT);
        service.sendMessage(c.id, bob, "Hey Alice! 😄", MessageType.EMOJI);

        service.markAsRead(c.id, bob);

        for (Conversation convo : service.getConversationsFor(alice)) {
            System.out.println("Conversation with: " +
                    convo.participants.stream().map(u -> u.name).toList());
            for (Message m : convo.messages) {
                System.out.println(m.sender.name + ": " + m.content);
            }
        }
    }
}