public class SmartHomeFacade {
    private Light light;
    private Thermostat thermostat;
    private SecuritySystem securitySystem;
    private EntertainmentSystem entertainmentSystem;

    public SmartHomeFacade(Light light, Thermostat thermostat, SecuritySystem securitySystem, EntertainmentSystem entertainmentSystem) {
        this.light = light;
        this.thermostat = thermostat;
        this.securitySystem = securitySystem;
        this.entertainmentSystem = entertainmentSystem;
    }

    public void leaveHome() {
        System.out.println("Leaving home...");
        light.turnOff();
        thermostat.setTemperature(18);
        securitySystem.arm();
        entertainmentSystem.turnOff();
        System.out.println("Home is secured.");
    }

    public void arriveHome() {
        System.out.println("Arriving home...");
        light.turnOn();
        thermostat.setTemperature(22);
        securitySystem.disarm();
        System.out.println("Welcome home!");
    }

    public void nightMode() {
        System.out.println("Activating night mode...");
        light.turnOff();
        thermostat.setTemperature(20);
        securitySystem.arm();
        entertainmentSystem.turnOff();
        System.out.println("Night mode activated.");
    }

    public void movieMode(String movie) {
        System.out.println("Activating movie mode...");
        light.turnOff();
        entertainmentSystem.turnOn();
        entertainmentSystem.playMovie(movie);
        System.out.println("Enjoy your movie!");
    }
}
