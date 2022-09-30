package decorator;

public class DarkRoast extends Beverage {
  DarkRoast() {
    description = "다크로스트";
  }

  public double cost() {
    return 0.99;
  }
}
