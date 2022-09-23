package observer;

public class StatisticsDisplay implements Observer {
  double temperature;
  double maxTemp = 0.0f;
  double minTemp = 200;
  double tempSum = 0.0f;
  int numReadings;
  WeatherData weatherData;

  public StatisticsDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  public void update() {
    temperature = weatherData.getTemperature();

    tempSum += temperature;
    numReadings++;

    if (temperature > maxTemp) {
      maxTemp = temperature;
    }

    if (temperature < minTemp) {
      minTemp = temperature;
    }

    display();
  }

  public void display() {
    System.out.println("《Statistics Display》");
    System.out.println("Avg temperature: " + (tempSum / numReadings));
    System.out.println("Max temperature: " + maxTemp);
    System.out.println("Min temperature: " + minTemp);
    System.out.println();
  }
}
