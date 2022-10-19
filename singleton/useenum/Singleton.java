package singleton.useenum;

public enum Singleton {
  UNIQUE_INSTANCE;

  public String getDescription() {
    return "I'm a thread safe Singleton with using enum!";
  }
}
