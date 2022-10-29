package adapter.duck;

public class DuckTestDrive {
  public static void main(String[] args) {
    Duck duck1 = new MallardDuck();
    Duck duck2 = new MallardDuck();
    Turkey turkey1 = new WildTurkey();
    Duck duck3 = new TurkeyAdapter(turkey1);

    Duck[] ducks = new Duck[100];
    int n = 0;

    ducks[n++] = duck1;
    ducks[n++] = duck2;
    ducks[n++] = duck3;

    for (int i = 0; i < n; i++) {
      testDuck(ducks[i]);
    }
  }

  public static void testDuck(Duck duck) {
    duck.quack();
    duck.fly();
  }
}
