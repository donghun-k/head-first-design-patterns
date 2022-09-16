package strategy;

public abstract class Duck {
  QuackBehavior quackBehavior;
  FlyBehavior flyBehavior;

  void swim() {
    System.out.println("둥~~~ 둥~~~");
  }

  public void performQuack() {
    quackBehavior.quack();
  }

  public void performFly() {
    flyBehavior.fly();
  }

  void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }

  void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  abstract void display();
}
