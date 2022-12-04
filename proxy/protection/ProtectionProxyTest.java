package proxy.protection;

import java.lang.reflect.Proxy;

public class ProtectionProxyTest {
  public static void main(String[] args) {
    Person donghun = new PersonImpl("DongHun", 26);
    Person joohyun = new PersonImpl("JooHyun", 22);

    Person proxyInstance = (Person) Proxy.newProxyInstance(joohyun.getClass().getClassLoader(),
        joohyun.getClass().getInterfaces(), new PersonInvocationHandler(joohyun));

    System.out.println("이름: " + donghun.getName());
    System.out.println("나이: " + donghun.getAge());

    System.out.println("이름: " + proxyInstance.getName());
    System.out.println("나이: " + proxyInstance.getAge());
  }
}
