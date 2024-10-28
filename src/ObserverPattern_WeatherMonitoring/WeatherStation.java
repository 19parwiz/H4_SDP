package ObserverPattern_WeatherMonitoring;

// WeatherStation.java
import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private List<WeatherDisplay> displays = new ArrayList<>();
    private double temperature;
    private double humidity;
    private double pressure;

    public void registerDisplay(WeatherDisplay display) {
        displays.add(display);
    }

    public void unregisterDisplay(WeatherDisplay display) {
        displays.remove(display);
    }

    public void notifyDisplays() {
        for (WeatherDisplay display : displays) {
            display.update(temperature, humidity, pressure);
        }
    }

    public void setWeatherData(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyDisplays();
    }
}
