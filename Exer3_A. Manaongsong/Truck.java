public class Truck extends LandTransport {
    private double cargoCapacity;
    private int axles;
    private String bedType;
    
    public Truck(String name, String color, String brand, double speed, 
                int capacity, int wheelCount, String fuelType,
                double cargoCapacity, int axles, String bedType) {
        super(name, color, brand, speed, capacity, wheelCount, fuelType);
        this.cargoCapacity = cargoCapacity;
        this.axles = axles;
        this.bedType = bedType;
    }
    
    public String loadCargo() {
        return name + " is loading " + cargoCapacity + " tons of cargo in its " + bedType + " bed.";
    }
    
    @Override
    public String displayInfo() {
        return super.displayInfo() + String.format(", Cargo Capacity=%.1f tons, Axles=%d, Bed Type=%s", 
                            cargoCapacity, axles, bedType);
    }
}
