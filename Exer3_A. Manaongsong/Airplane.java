public class Airplane extends AirTransport {
    private int engineCount;
    private double wingspan;
    private int passengerClasses;
    
    public Airplane(String name, String color, String brand, double speed, 
                   int capacity, double maxAltitude, String propulsionType,
                   int engineCount, double wingspan, int passengerClasses) {
        super(name, color, brand, speed, capacity, maxAltitude, propulsionType);
        this.engineCount = engineCount;
        this.wingspan = wingspan;
        this.passengerClasses = passengerClasses;
    }
    
    public String takeOff() {
        return name + " is taking off with " + engineCount + " engines.";
    }
    
    @Override
    public String displayInfo() {
        return super.displayInfo() + String.format(", Engines=%d, Wingspan=%.1f m, Classes=%d", 
                            engineCount, wingspan, passengerClasses);
    }
}
