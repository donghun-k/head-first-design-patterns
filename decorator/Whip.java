package decorator;

public class Whip extends CondimentDecorator {
  private Beverage beverage;

  Whip(Beverage beverage) {
    this.beverage = beverage;
  }

  public String getDescription() {
    return beverage.getDescription() + ", 휘핑 크림";
  }

  public double cost() {
    return beverage.cost() + 0.1;
  }
}
