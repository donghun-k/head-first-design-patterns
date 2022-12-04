package proxy.virtual;

import javax.swing.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class ImageProxyTestDrive {
  ImageComponent imageComponent;
  JFrame frame = new JFrame("Album Cover Viewer");
  JMenuBar menuBar;
  JMenu menu;
  Hashtable<String, String> albums = new Hashtable<String, String>();

  public static void main(String[] args) throws Exception {
    ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
  }

  public ImageProxyTestDrive() throws Exception {
    albums.put("Lifes Like",
        "https://w.namu.la/s/02a4e3fdf4f45af083748a29851e25d30e0d1886f530db5ba5a86cbaf6892427235216aa2d712f605283af28a2237aa08d68950a4ebd8daeacb0dae09aeeecdad342253e274eb32d00435be5dce0e802adecc8d47b195b624e188341dbb3f8c3e387f653fb1f579a30080156cf08fe61");
    albums.put("Modern Times",
        "https://w.namu.la/s/f9f331e254e231f19002f912d6d18ee1abf04f6650ce525d0c97fc8d62e834d9c25e800639f598e247fc396959fc8068d1c1332575aa840010e0dfbde56ba1972ad229376264b3a80a6dec992c31e2c1a3512e844697e5d17c4e71a8140af09a6790e04ebb1205a40f338172ceaa0ef4");

    URL initialURL = new URL((String) albums.get("Modern Times"));
    menuBar = new JMenuBar();
    menu = new JMenu("Favorite Albums");
    menuBar.add(menu);
    frame.setJMenuBar(menuBar);

    for (Enumeration<String> e = albums.keys(); e.hasMoreElements();) {
      String name = (String) e.nextElement();
      JMenuItem menuItem = new JMenuItem(name);
      menu.add(menuItem);
      menuItem.addActionListener(event -> {
        imageComponent.setIcon(new ImageProxy(getAlbumUrl(event.getActionCommand())));
        frame.repaint();
      });
    }

    Icon icon = new ImageProxy(initialURL);
    imageComponent = new ImageComponent(icon);
    frame.getContentPane().add(imageComponent);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(800, 600);
    frame.setVisible(true);

  }

  URL getAlbumUrl(String name) {
    try {
      return new URL((String) albums.get(name));
    } catch (MalformedURLException e) {
      e.printStackTrace();
      return null;
    }
  }
}