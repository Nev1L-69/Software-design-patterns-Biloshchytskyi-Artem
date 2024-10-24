// Main.java
public class Main {
    public static void main(String[] args) {
        // Create the receivers
        TV tv = new TV();
        Stereo stereo = new Stereo();
        Light light = new Light();

        // Create the commands
        Command turnTVOn = new TurnTVOnCommand(tv);
        Command setStereoVolume = new SetVolumeCommand(stereo, 20);
        Command dimLights = new DimLightsCommand(light, 50);

        // Create the remote control
        RemoteControl remote = new RemoteControl(3);

        // Set commands in the remote slots
        remote.setCommand(0, turnTVOn);
        remote.setCommand(1, setStereoVolume);
        remote.setCommand(2, dimLights);

        // Simulate button presses
        remote.pressButton(0); // Turn on TV
        remote.pressButton(1); // Set stereo volume to 20
        remote.pressButton(2); // Dim lights to 50%

        // Undo last action
        remote.pressUndo(); // Undo dim lights

        // Undo previous actions
        remote.pressUndo(); // Undo set stereo volume
        remote.pressUndo(); // Undo turn on TV
    }
}
