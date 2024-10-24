class CurrentConditionsDisplay implements WeatherDisplay {
    @Override
    public void update(double temperature, double humidity, double pressure) {
        System.out.println("Current conditions: " + temperature + "°C, " + humidity
                + "% humidity, " + pressure + " hPa");
    }
}

class StatisticsDisplay implements WeatherDisplay {
    private double maxTemp = Double.MIN_VALUE;
    private double minTemp = Double.MAX_VALUE;
    private double tempSum = 0.0;
    private int numReadings = 0;

    @Override
    public void update(double temperature, double humidity, double pressure) {
        tempSum += temperature;
        numReadings++;
        maxTemp = Math.max(maxTemp, temperature);
        minTemp = Math.min(minTemp, temperature);

        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }
}

class ForecastDisplay implements WeatherDisplay {
    private double lastPressure;

    @Override
    public void update(double temperature, double humidity, double pressure) {
        String forecast;
        if (pressure > lastPressure) {
            forecast = "Improving weather on the way!";
        } else if (pressure < lastPressure) {
            forecast = "Cooler, rainy weather is coming.";
        } else {
            forecast = "More of the same.";
        }
        lastPressure = pressure;

        System.out.println("Forecast: " + forecast);
    }
}
