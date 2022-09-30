package decorator;

public class HouseBlend extends Beverage {
  HouseBlend() {
    description = "하우스 블렌드";
  }

  public double cost() {
    return 0.89;
  }
}
