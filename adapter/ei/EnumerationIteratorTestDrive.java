package adapter.ei;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationIteratorTestDrive {
  public static void main(String[] args) {
    Vector<String> v = new Vector<String>();

    v.add("Kim");
    v.add("Choi");
    v.add("Park");

    Iterator<Object> i = new EnumerationIterator(v.elements());
    while (i.hasNext()) {
      Object s = i.next();
      System.out.println(s);
    }

    // Enumeration<String> e = v.elements();
    // while (e.hasMoreElements()) {
    // String s = e.nextElement();
    // System.out.println(s);
    // }

    // Iterator<String> i = v.iterator();
    // while (i.hasNext()) {
    // String s = i.next();
    // System.out.println(s);
    // }
  }
}
