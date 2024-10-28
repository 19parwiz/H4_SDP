package MediatorPattern_ChatRoom;

public class Main {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User user1 = new RegularUser(chatRoom, "Alice");
        User user2 = new PremiumUser(chatRoom, "Bob");
        User user3 = new RegularUser(chatRoom, "Charlie");
        User user4 = new PremiumUser(chatRoom, "Diana");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);
        chatRoom.addUser(user4);

        user1.sendMessage("Hello, everyone!");
        user3.sendMessage("Good morning!");
        user2.sendMessage("Hi, everyone. What's up?");
    }
}
