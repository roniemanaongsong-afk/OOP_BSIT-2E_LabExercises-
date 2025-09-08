// HouseTester.java
public class HouseTester {
    public static void main(String[] args) {
        // Creating House objects
        House house1 = new House("Martinez phase 8", "White", 3, 2500);
        House house2 = new House("Martinez phase 11", "Blue", 4, 3500);

        // Displaying house information
        System.out.println("House 1 Info:");
        house1.displayHouseInfo();

        System.out.println("\nHouse 2 Info:");
        house2.displayHouseInfo();
    }
}
