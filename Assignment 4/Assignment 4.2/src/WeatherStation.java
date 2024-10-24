// WeatherStation.java
import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private List<WeatherDisplay> displays;
    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherStation() {
        displays = new ArrayList<>();
    }

    public void addDisplay(WeatherDisplay display) {
        displays.add(display);
    }

    public void removeDisplay(WeatherDisplay display) {
        displays.remove(display);
    }

    public void setWeatherData(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyDisplays();
    }

    private void notifyDisplays() {
        for (WeatherDisplay display : displays) {
            display.update(temperature, humidity, pressure);
        }
    }
}
