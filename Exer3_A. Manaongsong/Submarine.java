public class Submarine extends WaterTransport {
    private double maxDepth;
    private int torpedoCount;
    private String pressureHullMaterial;
    
    public Submarine(String name, String color, String brand, double speed, 
                    int capacity, double displacement, String hullMaterial,
                    double maxDepth, int torpedoCount, String pressureHullMaterial) {
        super(name, color, brand, speed, capacity, displacement, hullMaterial);
        this.maxDepth = maxDepth;
        this.torpedoCount = torpedoCount;
        this.pressureHullMaterial = pressureHullMaterial;
    }
    
    public String dive() {
        return name + " is diving to " + maxDepth + " meters with its " + pressureHullMaterial + " hull.";
    }
    
    @Override
    public String displayInfo() {
        return super.displayInfo() + String.format(", Max Depth=%.1f m, Torpedoes=%d, Pressure Hull=%s", 
                            maxDepth, torpedoCount, pressureHullMaterial);
    }
}
