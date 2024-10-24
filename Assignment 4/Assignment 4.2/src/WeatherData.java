public class WeatherData {
    private WeatherStation weatherStation;

    public WeatherData() {
        weatherStation = new WeatherStation();

        // Add different displays
        weatherStation.addDisplay(new CurrentConditionsDisplay());
        weatherStation.addDisplay(new StatisticsDisplay());
        weatherStation.addDisplay(new ForecastDisplay());
    }

    public void updateWeather(double temperature, double humidity, double pressure) {
        weatherStation.setWeatherData(temperature, humidity, pressure);
    }
}
