import java.util.ArrayList;
import java.util.List;

class SmartHomeHub {
    private List<Command> commandHistory = new ArrayList<>();

    public void executeCommand(Command command) {
        command.execute();
        commandHistory.add(command);
    }

    public void showHistory() {
        System.out.println("Command History:");
        for (int i = 0; i < commandHistory.size(); i++) {
            System.out.println((i + 1) + ". " + commandHistory.get(i).getClass().getSimpleName());
        }
    }
}
