package ObserverPattern_WeatherMonitoring;

// ForecastDisplay.java
public class ForecastDisplay implements WeatherDisplay {
    @Override
    public void update(double temperature, double humidity, double pressure) {
        System.out.println("Forecast display: Predicting weather based on current data.");
    }
}
