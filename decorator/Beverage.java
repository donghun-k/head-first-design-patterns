package decorator;

public abstract class Beverage {
  protected String description = "설명 없음";

  public String getDescription() {
    return description;
  }

  abstract public double cost();
}