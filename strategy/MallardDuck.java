package strategy;

/**
 * MallardDuck
 */
public class MallardDuck extends Duck {

  MallardDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  void display() {
    System.out.println("나는 청둥오리~");
  }
}