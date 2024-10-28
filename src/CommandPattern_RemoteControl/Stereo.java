package CommandPattern_RemoteControl;

public class Stereo {
    private int volume;

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Stereo volume set to " + volume);
    }
}
