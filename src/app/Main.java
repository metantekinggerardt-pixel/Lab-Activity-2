package app;

import Contracts.Serviceable;
import Devices.Printer;
import Vehicle.Car;
import Vehicle.Motorcycle;
import Vehicle.Truck;
import Vehicle.Vehicle;

public class Main {

    public static void printDetails(Vehicle vehicle) {
        vehicle.displayInfo();
    }

    public static void performService(Serviceable item) {
        item.Service();
    }

    public static void main(String[] args) {
        System.out.println("=== 1. Parent Reference ===");

        Vehicle vehicle = new Car("Toyota", "Vios", 2022, 4);
        vehicle.displayInfo();
        vehicle.moveForward();
        vehicle.moveBackward();
        vehicle.moveLeft();
        vehicle.moveRight();
        performService((Serviceable) vehicle);
        System.out.println();

        vehicle = new Motorcycle("Honda", "Click 125i", 2023,
                "4-stroke, single-cylinder, liquid-cooled engine");
        vehicle.displayInfo();
        vehicle.moveForward();
        vehicle.moveBackward();
        vehicle.moveLeft();
        vehicle.moveRight();
        performService((Serviceable) vehicle);
        System.out.println();

        Truck truck = new Truck("Mitsubishi", "L300", 2024, 4);
        truck.displayInfo();
        vehicle.moveForward();
        vehicle.moveBackward();
        vehicle.moveLeft();
        vehicle.moveRight();
        performService((Serviceable) truck);
        System.out.println();

        System.out.println("\n=== 2. Method Parameter ===");

        Car car = new Car("Toyota", "Fortuner", 2021, 4);

        Motorcycle motorcycle = new Motorcycle("Yamaha", "Mio i125", 2022,
                "4-stroke, single-cylinder, air-cooled engine");

        Truck trucks = new Truck("Isuzu", "N-Series", 2020, 4);

        printDetails(car);
        car.moveForward();
        car.moveBackward();
        car.moveLeft();
        car.moveRight();
        performService((Serviceable) car);
        System.out.println();

        printDetails(motorcycle);
        motorcycle.moveForward();
        motorcycle.moveBackward();
        motorcycle.moveLeft();
        motorcycle.moveRight();
        performService((Serviceable) motorcycle);
        System.out.println();

        printDetails(trucks);
        trucks.moveForward();
        trucks.moveBackward();
        trucks.moveLeft();
        trucks.moveRight();
        performService((Serviceable) trucks);
        System.out.println();

        System.out.println("\n=== 3. Polymorphic Array ===");

        Vehicle[] vehicles = {
                new Car("Honda", "City", 2023, 4),
                new Motorcycle("Suzuki", "Raider R150", 2022,
                        "4-stroke, single-cylinder, liquid-cooled engine"),
                new Truck("Toyota", "Hilux", 2023, 4)
        };

        Serviceable[] serviceables = {
                new Car("Honda", "City", 2023, 4),
                new Motorcycle("Suzuki", "Raider R150", 2022,
                        "4-stroke, single-cylinder, liquid-cooled engine"),
                new Truck("Toyota", "Hilux", 2023, 4),
                new Printer()
        };
        for (Vehicle currentVehicle : vehicles) {
            printDetails(currentVehicle);
            currentVehicle.moveForward();
            currentVehicle.moveBackward();
            currentVehicle.moveLeft();
            currentVehicle.moveRight();
            performService((Serviceable) currentVehicle);
            System.out.println();
        }
        for (Serviceable serviceable : serviceables) {
            performService(serviceable);
        }
        System.out.println();
    }
}
