package CommandPattern_RemoteControl;

public class DimLights implements Command {
    private Light light;

    public DimLights(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.dim();
    }

    @Override
    public void undo() {
        light.brighten(); // Assuming brighten returns to full brightness
    }
}
