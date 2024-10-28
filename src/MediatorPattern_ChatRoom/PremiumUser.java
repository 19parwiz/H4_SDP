package MediatorPattern_ChatRoom;

public class PremiumUser extends User {
    public PremiumUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(this.name + " (PremiumUser) sends: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(this.name + " (PremiumUser) received: " + message);
    }
}
