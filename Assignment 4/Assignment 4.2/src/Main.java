public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        // Simulate new weather data
        weatherData.updateWeather(25.0, 65.0, 1013.0);
        weatherData.updateWeather(27.0, 70.0, 1012.5);
        weatherData.updateWeather(22.0, 90.0, 1011.0);
    }
}
