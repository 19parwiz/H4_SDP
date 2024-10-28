package ObserverPattern_WeatherMonitoring;

// StatisticsDisplay.java
public class StatisticsDisplay implements WeatherDisplay {
    @Override
    public void update(double temperature, double humidity, double pressure) {
        System.out.println("Statistics display: Temperature: " + temperature + "°C, Humidity: " + humidity + "%, Pressure: " + pressure + " hPa.");
    }
}
