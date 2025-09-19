public class LandTransport extends Transportation {
    protected int wheelCount;
    protected String fuelType;
    
    public LandTransport(String name, String color, String brand, double speed, 
                        int capacity, int wheelCount, String fuelType) {
        super(name, color, brand, speed, capacity);
        this.wheelCount = wheelCount;
        this.fuelType = fuelType;
    }
    
    public String drive() {
        return String.format("%s is driving on %d wheels using %s.", 
                            name, wheelCount, fuelType);
    }
    
    @Override
    public String displayInfo() {
        return super.displayInfo() + String.format(", Wheels=%d, Fuel=%s", 
                            wheelCount, fuelType);
    }
}
