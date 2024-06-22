package Command.Example2;

public class Start {
    public static void main(String[] args) {
        Light light = new Light();
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        RemoteControl control= new RemoteControl();
        control.setCommand(lightOn);
        control.pressButton();
        control.setCommand(lightOff);
        control.pressButton();
    }
}
