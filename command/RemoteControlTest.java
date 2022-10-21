package command;

public class RemoteControlTest {
  public static void main(String[] args) {
    RemoteControl remote = new RemoteControl();

    Light livingRoomLight = new Light("Living Room");
    Light kitchenLight = new Light("Kitchen");
    TV livingRoomTV = new TV("Living Room");

    LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
    LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
    LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
    LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
    TVOnCommand tvOn = new TVOnCommand(livingRoomTV);
    TVOffCommand tvOff = new TVOffCommand(livingRoomTV);

    Command[] allLightsOn = { livingRoomLightOn, kitchenLightOn };
    Command[] allLightsOff = { livingRoomLightOff, kitchenLightOff };

    MacroCommand allLightsOnMacro = new MacroCommand(allLightsOn);
    MacroCommand allLightsOffMacro = new MacroCommand(allLightsOff);

    remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
    remote.setCommand(1, kitchenLightOn, kitchenLightOff);
    remote.setCommand(2, tvOn, tvOff);
    remote.setCommand(3, allLightsOnMacro, allLightsOffMacro);

    remote.onButtonWasPushed(0);
    remote.offButtonWasPushed(0);

    remote.onButtonWasPushed(1);
    remote.offButtonWasPushed(1);

    remote.onButtonWasPushed(2);
    remote.offButtonWasPushed(2);

    remote.undoButtonWasPushed();

    remote.onButtonWasPushed(3);
    remote.offButtonWasPushed(3);

    remote.undoButtonWasPushed();

    remote.onButtonWasPushed(4);
  }
}
