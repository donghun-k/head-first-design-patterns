package factory.method;

public class ChicagoPizzaStore extends PizzaStore {
  public Pizza createPizza(String item) {
    switch (item) {
      case "cheese":
        return new ChicagoStyleCheesePizza();
      case "veggie":
        return new ChicagoStyleVeggiePizza();
      case "clam":
        return new ChicagoStyleClamPizza();
      case "pepperoni":
        return new ChicagoStylePepperoniPizza();
      default:
        return null;
    }
  }
}