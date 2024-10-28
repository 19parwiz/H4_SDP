package CommandPattern_RemoteControl;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        Stereo stereo = new Stereo();
        Light light = new Light();

        RemoteControl remote = new RemoteControl(3);

        // Create command objects
        Command turnTVOn = new TurnTVOn(tv);
        Command setVolume = new SetVolume(stereo, 5);
        Command dimLights = new DimLights(light);

        // Set commands in remote
        remote.setCommand(0, turnTVOn);
        remote.setCommand(1, setVolume);
        remote.setCommand(2, dimLights);

        // Use remote
        remote.pressButton(0); // Turn on TV
        remote.pressButton(1); // Set volume
        remote.pressButton(2); // Dim lights

        // Use undo
        remote.pressUndo(); // Brighten lights
        remote.pressUndo(); // Set volume to 0
        remote.pressUndo(); // Turn off TV
    }
}
