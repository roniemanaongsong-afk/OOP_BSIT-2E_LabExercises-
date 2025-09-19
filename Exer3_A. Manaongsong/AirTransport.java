public class AirTransport extends Transportation {
    protected double maxAltitude;
    protected String propulsionType;
    
    public AirTransport(String name, String color, String brand, double speed, 
                       int capacity, double maxAltitude, String propulsionType) {
        super(name, color, brand, speed, capacity);
        this.maxAltitude = maxAltitude;
        this.propulsionType = propulsionType;
    }
    
    public String fly() {
        return String.format("%s is flying at %.1f meters with %s propulsion.", 
                            name, maxAltitude, propulsionType);
    }
    
    @Override
    public String displayInfo() {
        return super.displayInfo() + String.format(", Max Altitude=%.1f m, Propulsion=%s", 
                            maxAltitude, propulsionType);
    }
}
