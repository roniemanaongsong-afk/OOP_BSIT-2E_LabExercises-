public class Motorcycle extends LandTransport {
    private String engineType;
    private boolean hasSidecar;
    private String bikeType;
    
    public Motorcycle(String name, String color, String brand, double speed, 
                     int capacity, int wheelCount, String fuelType,
                     String engineType, boolean hasSidecar, String bikeType) {
        super(name, color, brand, speed, capacity, wheelCount, fuelType);
        this.engineType = engineType;
        this.hasSidecar = hasSidecar;
        this.bikeType = bikeType;
    }
    
    public String revEngine() {
        return name + " is revving its " + engineType + " engine.";
    }
    
    @Override
    public String displayInfo() {
        return super.displayInfo() + String.format(", Engine Type=%s, Sidecar=%s, Bike Type=%s", 
                            engineType, hasSidecar, bikeType);
    }
}
