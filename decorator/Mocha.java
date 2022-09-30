package decorator;

public class Mocha extends CondimentDecorator {
  private Beverage beverage;

  Mocha(Beverage beverage) {
    this.beverage = beverage;
  }

  public String getDescription() {
    return beverage.getDescription() + ", 모카";
  }

  public double cost() {
    return beverage.cost() + 0.2;
  }
}
