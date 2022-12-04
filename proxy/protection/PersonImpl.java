package proxy.protection;

public class PersonImpl implements Person {
  private String name;
  private int age;

  public PersonImpl(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String toString() {
    return name + "의 나이는 " + age + "세";
  }
}
