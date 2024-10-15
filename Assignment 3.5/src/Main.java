public class Main {
    public static void main(String[] args) {
        // Create instances of smart devices
        Light light = new Light();
        Thermostat thermostat = new Thermostat();
        SecuritySystem securitySystem = new SecuritySystem();
        EntertainmentSystem entertainmentSystem = new EntertainmentSystem();

        SmartHomeFacade smartHome = new SmartHomeFacade(light, thermostat, securitySystem, entertainmentSystem);

        smartHome.arriveHome();
        System.out.println();

        smartHome.movieMode("Inception");
        System.out.println();

        smartHome.nightMode();
        System.out.println();

        smartHome.leaveHome();
    }
}

