// RemoteControl.java
public class RemoteControl {
    private Command[] commandSlots;
    private Command lastCommand;

    public RemoteControl(int numberOfSlots) {
        commandSlots = new Command[numberOfSlots];
        Command noCommand = new NoCommand();
        for (int i = 0; i < numberOfSlots; i++) {
            commandSlots[i] = noCommand; // Assign NoCommand initially
        }
        lastCommand = noCommand; // NoCommand for undo initially
    }

    public void setCommand(int slot, Command command) {
        if (slot >= 0 && slot < commandSlots.length) {
            commandSlots[slot] = command;
        }
    }

    public void pressButton(int slot) {
        if (slot >= 0 && slot < commandSlots.length && commandSlots[slot] != null) {
            commandSlots[slot].execute();
            lastCommand = commandSlots[slot];
        }
    }

    public void pressUndo() {
        lastCommand.undo();
    }
}
