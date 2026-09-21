public class Vehicle {

    // Fields
    String brand;
    String model;
    int year;

    // Method 1: Display all information
    void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }

    // Method 2: Calculate age
    int calculateAge() {
        return 2026 - year;
    }

    // Method 3: Check if the vehicle is vintage
    boolean isVintage() {
        return calculateAge() > 25;
    }
}