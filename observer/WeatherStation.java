package observer;

public class WeatherStation {
  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();

    CurrentConditionsDisplay display1 = new CurrentConditionsDisplay(weatherData);
    StatisticsDisplay display2 = new StatisticsDisplay(weatherData);
    ForecastDisplay display3 = new ForecastDisplay(weatherData);

    weatherData.setMeasurements(80, 65, 30.4f);
    weatherData.setMeasurements(82, 70, 29.2f);
    weatherData.setMeasurements(69, 74, 29.2f);
  }
}
