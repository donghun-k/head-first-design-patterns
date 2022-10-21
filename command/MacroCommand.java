package command;

public class MacroCommand implements Command {
  Command[] commands;

  public MacroCommand(Command[] commands) {
    this.commands = commands;
  }

  public void execute() {
    System.out.println("====== Execute Macro ======");
    for (Command command : commands) {
      command.execute();
    }
  }

  public void undo() {
    System.out.println("====== Undo Macro ======");
    for (Command command : commands) {
      command.undo();
    }
  }

}
