package observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
  private ArrayList<Observer> observers;
  private double temperature;
  private double humidity;
  private double pressure;

  WeatherData() {
    observers = new ArrayList<Observer>();
  }

  public void registerObserver(Observer o) {
    observers.add(o);
  }

  public void removeObserver(Observer o) {
    int i = observers.indexOf(o);
    if (i >= 0) {
      observers.remove(i);
    }
  }

  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update();
    }
  }

  public double getTemperature() {
    return temperature;
  }

  public double getHumidity() {
    return humidity;
  }

  public double getPressure() {
    return pressure;
  }

  void measurementChanged() {
    notifyObservers();
  }

  void setMeasurements(double temperature, double humidity, double pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;

    measurementChanged();
  }
}
