
class TV {
    public void turnOn() {
        System.out.println("The TV is now ON.");
    }

    public void turnOff() {
        System.out.println("The TV is now OFF.");
    }
}

class Stereo {
    private int volume;

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("The stereo volume is set to " + volume);
    }

    public int getVolume() {
        return volume;
    }
}

class Light {
    private int brightness;

    public void dim(int level) {
        brightness = level;
        System.out.println("The light brightness is set to " + brightness + "%.");
    }

    public int getBrightness() {
        return brightness;
    }
}
