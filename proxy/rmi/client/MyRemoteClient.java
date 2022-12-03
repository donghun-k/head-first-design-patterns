package proxy.rmi.client;

import java.rmi.Naming;

import proxy.rmi.server.MyRemote;

public class MyRemoteClient {
  public static void main(String[] args) {
    new MyRemoteClient().go();
  }

  public void go() {
    try {
      MyRemote service = (MyRemote) Naming.lookup("rmi://localhost/RemoteHello");

      String s = service.sayHello();

      System.out.println(s);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
