package templatemethod.barista;

public class BeverageTestDrive {
  public static void main(String[] args) {
    Tea tea = new Tea();
    Coffee coffee = new Coffee();
    CoffeeWithHook coffeeHook = new CoffeeWithHook();

    System.out.println("=== Making tea... ===");
    tea.prepareRecipe();
    System.out.println("=== Making coffee... ===");
    coffee.prepareRecipe();
    System.out.println("=== Making coffee... ===");
    coffeeHook.prepareRecipe();
  }
}