package factory.abs;

public class PizzaTestDrive {
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();

		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("DongHun ordered a " + pizza + "\n");

		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("JooHyun ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza("clam");
		System.out.println("DongHun ordered a " + pizza + "\n");

		pizza = chicagoStore.orderPizza("clam");
		System.out.println("JooHyun ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza("pepperoni");
		System.out.println("DongHun ordered a " + pizza + "\n");

		pizza = chicagoStore.orderPizza("pepperoni");
		System.out.println("JooHyun ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza("veggie");
		System.out.println("DongHun ordered a " + pizza + "\n");

		pizza = chicagoStore.orderPizza("veggie");
		System.out.println("JooHyun ordered a " + pizza + "\n");
	}
}
