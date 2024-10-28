package ObserverPattern_WeatherMonitoring;

// Main.java
public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        weatherStation.registerDisplay(currentConditions);
        weatherStation.registerDisplay(statisticsDisplay);
        weatherStation.registerDisplay(forecastDisplay);

        WeatherData weatherData = new WeatherData(weatherStation);

        // Simulating weather data changes
        weatherData.setWeatherData(25.0, 60.0, 1013.0);
        weatherData.setWeatherData(28.0, 65.0, 1012.0);
        weatherData.setWeatherData(30.0, 70.0, 1011.0);
    }
}
