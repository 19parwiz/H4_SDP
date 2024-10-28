package MediatorPattern_ChatRoom;

public interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}
