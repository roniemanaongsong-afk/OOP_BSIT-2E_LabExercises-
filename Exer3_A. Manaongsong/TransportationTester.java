public class TransportationTester {
    public static void main(String[] args) {
        // Create instances of each transportation type
        Airplane airplane = new Airplane("747", "White", "Boeing", 913, 416, 
                                        13100, "Jet", 4, 68.4, 3);
        
        Helicopter helicopter = new Helicopter("Black Hawk", "Black", "Sikorsky", 
                                              278, 11, 5790, "Turboshaft", 
                                              4, true, "Main and Tail");
        
        Truck truck = new Truck("F-150", "Red", "Ford", 120, 3, 4, "Gasoline", 
                                1.5, 2, "Standard");
        
        SUV suv = new SUV("Land Cruiser", "Silver", "Toyota", 180, 8, 4, "Diesel", 
                          true, 3, "4x4");
        
        Tricycle tricycle = new Tricycle("Pedal Power", "Blue", "Local", 15, 2, 
                                        3, "Human", true, "Standard", "Steel");
        
        Motorcycle motorcycle = new Motorcycle("Sportster", "Black", "Harley Davidson", 
                                              160, 2, 2, "Gasoline", "V-Twin", 
                                              false, "Cruiser");
        
        Kariton kariton = new Kariton("Wooden Cart", "Brown", "N/A", 5, 1, 
                                     2, "Human", "Wood", false, "Wooden");
        
        Boat boat = new Boat("Speedster", "White", "Yamaha", 80, 6, 1.2, 
                            "Fiberglass", false, 1, "Speedboat");
        
        Submarine submarine = new Submarine("Seawolf", "Black", "General Dynamics", 
                                           46, 134, 18700, "HY-100 Steel", 
                                           300, 16, "Titanium");
        
        // Display information about each transportation
        System.out.println("=== AIR TRANSPORT ===");
        System.out.println(airplane.displayInfo());
        System.out.println(airplane.move());
        System.out.println(airplane.fly());
        System.out.println(airplane.takeOff());
        
        System.out.println("\n" + helicopter.displayInfo());
        System.out.println(helicopter.move());
        System.out.println(helicopter.fly());
        System.out.println(helicopter.hover());
        
        System.out.println("\n=== LAND TRANSPORT ===");
        System.out.println(truck.displayInfo());
        System.out.println(truck.move());
        System.out.println(truck.drive());
        System.out.println(truck.loadCargo());
        
        System.out.println("\n" + suv.displayInfo());
        System.out.println(suv.move());
        System.out.println(suv.drive());
        System.out.println(suv.offRoad());
        
        System.out.println("\n" + tricycle.displayInfo());
        System.out.println(tricycle.move());
        System.out.println(tricycle.drive());
        System.out.println(tricycle.pedal());
        
        System.out.println("\n" + motorcycle.displayInfo());
        System.out.println(motorcycle.move());
        System.out.println(motorcycle.drive());
        System.out.println(motorcycle.revEngine());
        
        System.out.println("\n" + kariton.displayInfo());
        System.out.println(kariton.move());
        System.out.println(kariton.drive());
        System.out.println(kariton.push());
        
        System.out.println("\n=== WATER TRANSPORT ===");
        System.out.println(boat.displayInfo());
        System.out.println(boat.move());
        System.out.println(boat.sail());
        System.out.println(boat.row());
        
        System.out.println("\n" + submarine.displayInfo());
        System.out.println(submarine.move());
        System.out.println(submarine.sail());
        System.out.println(submarine.dive());
        
        System.out.println("\n=== ALL TRANSPORTATION TYPES CREATED SUCCESSFULLY ===");
    }
}
