package iterator;

public class MenuTestDrive {
  public static void main(String args[]) {
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    DinerMenu dinerMenu = new DinerMenu();
    CafeMenu cafeMenu = new CafeMenu();

    Waitress hyun = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);

    hyun.printMenu();
    hyun.printVegetarianMenu();

    System.out.println("\nCustomer asks, is the Hotdog vegetarian?");
    System.out.print("Waitress says: ");
    if (hyun.isItemVegetarian("Hotdog")) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
    System.out.println("\nCustomer asks, are the Waffles vegetarian?");
    System.out.print("Waitress says: ");
    if (hyun.isItemVegetarian("Waffles")) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}