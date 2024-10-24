// TurnOnLightsCommand.java
class TurnOnLightsCommand implements Command {
    private Light light;

    public TurnOnLightsCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}

// SetThermostatCommand.java
class SetThermostatCommand implements Command {
    private Thermostat thermostat;
    private int temperature;

    public SetThermostatCommand(Thermostat thermostat, int temperature) {
        this.thermostat = thermostat;
        this.temperature = temperature;
    }

    @Override
    public void execute() {
        thermostat.setTemperature(temperature);
    }
}

// LockDoorsCommand.java
class LockDoorsCommand implements Command {
    private DoorLock doorLock;

    public LockDoorsCommand(DoorLock doorLock) {
        this.doorLock = doorLock;
    }

    @Override
    public void execute() {
        doorLock.lock();
    }
}
