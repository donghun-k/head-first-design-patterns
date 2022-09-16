package strategy;

public class MiniDuckSimulator {

  public static void main(String[] args) {
    // Upcasting
    Duck mallard = new MallardDuck();
    Duck rubber = new RubberDuck();
    Duck decoy = new DecoyDuck();

    mallard.performQuack();
    mallard.performFly();
    mallard.swim();
    mallard.display();

    rubber.performQuack();
    rubber.performFly();
    rubber.swim();
    rubber.display();

    decoy.performQuack();
    decoy.performFly();
    decoy.swim();
    decoy.display();
    decoy.setFlyBehavior(new FlyRocketPowered());
    decoy.performFly();
  }
}