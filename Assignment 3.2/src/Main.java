public class Main {
    public static void main(String[] args) {
        Device tv = new TVDevice();
        Device dvd = new DVDDevice();
        Device soundSystem = new SoundSystemDevice();

        RemoteControl basicRemote = new BasicRemote(tv);
        AdvancedRemote advancedRemote = new AdvancedRemote(dvd);

        // Use BasicRemote with TV
        System.out.println("Using Basic Remote with TV:");
        basicRemote.powerOn();
        basicRemote.setChannel(5);
        basicRemote.setVolume(20);
        basicRemote.powerOff();

        // Use AdvancedRemote with DVD
        System.out.println("\nUsing Advanced Remote with DVD:");
        advancedRemote.powerOn();
        advancedRemote.setVolume(10);
        advancedRemote.mute();
        advancedRemote.setChannel(3);
        advancedRemote.powerOff();

        // Use BasicRemote with Sound System
        System.out.println("\nUsing Basic Remote with Sound System:");
        basicRemote = new BasicRemote(soundSystem);
        basicRemote.powerOn();
        basicRemote.setVolume(30);
        basicRemote.powerOff();
    }
}
