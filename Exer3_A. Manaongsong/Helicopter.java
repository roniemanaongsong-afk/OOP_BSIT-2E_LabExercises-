public class Helicopter extends AirTransport {
    private int rotorBlades;
    private boolean hasAutopilot;
    private String rotorType;
    
    public Helicopter(String name, String color, String brand, double speed, 
                     int capacity, double maxAltitude, String propulsionType,
                     int rotorBlades, boolean hasAutopilot, String rotorType) {
        super(name, color, brand, speed, capacity, maxAltitude, propulsionType);
        this.rotorBlades = rotorBlades;
        this.hasAutopilot = hasAutopilot;
        this.rotorType = rotorType;
    }
    
    public String hover() {
        return name + " is hovering with " + rotorBlades + " rotor blades.";
    }
    
    @Override
    public String displayInfo() {
        return super.displayInfo() + String.format(", Rotor Blades=%d, Autopilot=%s, Rotor Type=%s", 
                            rotorBlades, hasAutopilot, rotorType);
    }
}
