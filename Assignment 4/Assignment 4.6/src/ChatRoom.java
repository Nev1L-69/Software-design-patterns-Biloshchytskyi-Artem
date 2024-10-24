// ChatRoom.java
import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {
    private List<User> users;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User sender) {
        for (User user : users) {
            // Don't notify the sender
            if (user != sender) {
                user.receive(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
