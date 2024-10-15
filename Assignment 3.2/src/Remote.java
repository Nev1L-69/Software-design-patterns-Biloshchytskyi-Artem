class BasicRemote extends RemoteControl {
    public BasicRemote(Device device) {
        super(device);
    }

    public void togglePower() {
        if (device.isPoweredOn()) {
            device.powerOff();
        } else {
            device.powerOn();
        }
    }
}

class AdvancedRemote extends RemoteControl {
    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        System.out.println("Muting the device.");
        device.setVolume(0);
    }

    public void setCustomChannel(int channel) {
        System.out.println("Setting a custom channel.");
        device.setChannel(channel);
    }
}
