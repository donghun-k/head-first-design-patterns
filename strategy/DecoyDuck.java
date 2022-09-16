package strategy;

public class DecoyDuck extends Duck {
  DecoyDuck() {
    quackBehavior = new MuteQuack();
    flyBehavior = new FlyNoWay();
  }

  void display() {
    System.out.println("나는 나무 오리~");
  }
}
