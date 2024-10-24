// Main.java
public class Main {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User user1 = new RegularUser(chatRoom, "Alice");
        User user2 = new RegularUser(chatRoom, "Bob");
        User user3 = new PremiumUser(chatRoom, "Charlie");
        User user4 = new PremiumUser(chatRoom, "Dave");

        // Add users to the chat room
        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);
        chatRoom.addUser(user4);

        // Users send messages
        user1.send("Hello, everyone!");
        user3.send("Hey Alice, how are you?");
    }
}
