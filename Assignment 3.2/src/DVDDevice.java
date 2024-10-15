public class DVDDevice implements Device {
    private boolean powerOn = false;
    private int volume = 0;
    private int channel = 1;

    @Override
    public void powerOn() {
        powerOn = true;
        System.out.println("DVD Player is now ON");
    }

    @Override
    public void powerOff() {
        powerOn = false;
        System.out.println("DVD Player is now OFF");
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("DVD channel set to " + channel);
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("DVD volume set to " + volume);
    }

    @Override
    public boolean isPoweredOn() {
        return powerOn;
    }
}