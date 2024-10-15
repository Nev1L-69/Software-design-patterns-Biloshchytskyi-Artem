public class SoundSystemDevice implements Device {
    private boolean powerOn = false;
    private int volume = 0;

    @Override
    public void powerOn() {
        powerOn = true;
        System.out.println("Sound system is now ON");
    }

    @Override
    public void powerOff() {
        powerOn = false;
        System.out.println("Sound system is now OFF");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Sound system does not support channel setting.");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Sound system volume set to " + volume);
    }

    @Override
    public boolean isPoweredOn() {
        return powerOn;
    }
}