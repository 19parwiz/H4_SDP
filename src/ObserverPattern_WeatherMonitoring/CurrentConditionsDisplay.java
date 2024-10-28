package ObserverPattern_WeatherMonitoring;

// CurrentConditionsDisplay.java
public class CurrentConditionsDisplay implements WeatherDisplay {
    @Override
    public void update(double temperature, double humidity, double pressure) {
        System.out.println("Current conditions: " + temperature + "°C, " + humidity + "% humidity, " + pressure + " hPa pressure.");
    }
}
