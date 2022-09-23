package observer;

public class ForecastDisplay implements Observer {
  private double currentPressure = 29.9f;
  private double lastPressure;
  WeatherData weatherData;

  public ForecastDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  public void update() {
    lastPressure = currentPressure;
    currentPressure = weatherData.getPressure();
    display();
  }

  public void display() {
    System.out.println("《Forecast Display》");
    System.out.print("Forecast: ");
    if (currentPressure > lastPressure) {
      System.out.println("Improving weather on the way!");
    } else if (currentPressure == lastPressure) {
      System.out.println("More of the same");
    } else if (currentPressure < lastPressure) {
      System.out.println("Watch out for cooler, rainy weather");
    }
    System.out.println();
  }
}
