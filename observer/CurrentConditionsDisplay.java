package observer;

public class CurrentConditionsDisplay implements Observer {
  double temperature;
  double humidity;
  WeatherData weatherData;

  public CurrentConditionsDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  public void update() {
    this.temperature = weatherData.getTemperature();
    this.humidity = weatherData.getHumidity();
    display();
  }

  public void display() {
    System.out.println("《Current Condition Display》");
    System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    System.out.println();
  }
}
