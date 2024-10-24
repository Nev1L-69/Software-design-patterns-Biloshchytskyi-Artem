class TurnTVOnCommand implements Command {
    private TV tv;

    public TurnTVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }

    @Override
    public void undo() {
        tv.turnOff();
    }
}

class SetVolumeCommand implements Command {
    private Stereo stereo;
    private int previousVolume;
    private int newVolume;

    public SetVolumeCommand(Stereo stereo, int newVolume) {
        this.stereo = stereo;
        this.newVolume = newVolume;
    }

    @Override
    public void execute() {
        previousVolume = stereo.getVolume();
        stereo.setVolume(newVolume);
    }

    @Override
    public void undo() {
        stereo.setVolume(previousVolume);
    }
}

class DimLightsCommand implements Command {
    private Light light;
    private int previousLevel;
    private int newLevel;

    public DimLightsCommand(Light light, int newLevel) {
        this.light = light;
        this.newLevel = newLevel;
    }

    @Override
    public void execute() {
        previousLevel = light.getBrightness();
        light.dim(newLevel);
    }

    @Override
    public void undo() {
        light.dim(previousLevel);
    }
}
