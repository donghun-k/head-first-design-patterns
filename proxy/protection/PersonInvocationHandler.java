package proxy.protection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PersonInvocationHandler implements InvocationHandler {
  Person p;

  public PersonInvocationHandler(Person p) {
    this.p = p;
  }

  public Object invoke(Object o, Method m, Object[] args) throws Throwable {
    try {
      if (m.getName().equals("getName")) {
        return m.invoke(p, args) + "님";
      } else if (m.getName().equals("getAge")) {
        return m.invoke(p, args);
      } else if (m.getName().equals("toString")) {
        return m.invoke(p, args);
      } else {
        return m.invoke(p, args);
      }
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    }
    return m.invoke(p, args);
  }
}
