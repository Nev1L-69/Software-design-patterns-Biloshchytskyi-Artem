// Main.java
public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        Thermostat thermostat = new Thermostat();
        DoorLock frontDoorLock = new DoorLock();

        Command turnOnLights = new TurnOnLightsCommand(livingRoomLight);
        Command setThermostat = new SetThermostatCommand(thermostat, 22);
        Command lockDoors = new LockDoorsCommand(frontDoorLock);

        SmartHomeHub smartHub = new SmartHomeHub();

        System.out.println("Executing voice commands:");
        smartHub.executeCommand(turnOnLights);
        smartHub.executeCommand(setThermostat);
        smartHub.executeCommand(lockDoors);

        System.out.println("\nShowing command history:");
        smartHub.showHistory();
    }
}
