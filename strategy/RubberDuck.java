package strategy;

public class RubberDuck extends Duck {
  RubberDuck() {
    quackBehavior = new Squeak();
    flyBehavior = new FlyNoWay();
  }

  void display() {
    System.out.println("나는 고무 오리~");
  }
}
