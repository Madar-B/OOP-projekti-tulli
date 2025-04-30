public class Kello {
    // Private static member to hold the unique instance
    private static Kello instance;

    // Private member to hold the simulation clock
    private double simulaationKello; // часы симуляции в минутах

    // Private constructor to prevent instantiation from outside
    private Kello() {
        simulaationKello = 720.0; // начинаем с 12:00 (720 минут)
    }

    // Public static method to access the unique instance
    public static Kello getInstance() {
        if (instance == null) {
            instance = new Kello();
        }
        return instance;
    }

    // Public method to get the simulation clock value
    public double getKello() {
        return simulaationKello;
    }

    // Public method to advance the clock by deltaTime minutes
    public void siirraKelloa(double deltaTime) {
        simulaationKello += deltaTime;
    }

    // Public method to get the current simulation time as a formatted string
    public void getFormattedSimulationTime() {
        int hours = (int) (simulaationKello / 60);
        int minutes = (int) (simulaationKello % 60);
        System.out.println (String.format("%02d:%02d", hours, minutes));
    }

}
