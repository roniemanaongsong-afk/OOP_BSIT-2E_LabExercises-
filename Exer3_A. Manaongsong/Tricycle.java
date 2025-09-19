public class Tricycle extends LandTransport {
    private boolean hasBasket;
    private String pedalType;
    private String frameMaterial;
    
    public Tricycle(String name, String color, String brand, double speed, 
                   int capacity, int wheelCount, String fuelType,
                   boolean hasBasket, String pedalType, String frameMaterial) {
        super(name, color, brand, speed, capacity, wheelCount, fuelType);
        this.hasBasket = hasBasket;
        this.pedalType = pedalType;
        this.frameMaterial = frameMaterial;
    }
    
    public String pedal() {
        return name + " is being pedaled with " + pedalType + " pedals.";
    }
    
    @Override
    public String displayInfo() {
        return super.displayInfo() + String.format(", Basket=%s, Pedal Type=%s, Frame Material=%s", 
                            hasBasket, pedalType, frameMaterial);
    }
}
