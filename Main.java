public class Main {

    public static void printDetails(Vehicle vehicle) {
        vehicle.displayInfo();
    }

    public static void main(String[] args) {
        System.out.println("=== 1. Parent Reference ===");

        Vehicle vehicle = new Car("Toyota", "Vios", 2022, 4);
        vehicle.displayInfo();
        vehicle.moveForward();
        vehicle.moveBackward();
        vehicle.moveLeft();
        vehicle.moveRight();
        System.out.println();

        vehicle = new Motorcycle("Honda", "Click 125i", 2023,
                "4-stroke, single-cylinder, liquid-cooled engine");
        vehicle.displayInfo();
        vehicle.moveForward();
        vehicle.moveBackward();
        vehicle.moveLeft();
        vehicle.moveRight();
        System.out.println();

        Truck truck = new Truck("Mitsubishi", "L300", 2024, 4);
        truck.displayInfo();
        vehicle.moveForward();
        vehicle.moveBackward();
        vehicle.moveLeft();
        vehicle.moveRight();
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
        System.out.println();

        printDetails(motorcycle);
        motorcycle.moveForward();
        motorcycle.moveBackward();
        motorcycle.moveLeft();
        motorcycle.moveRight();
        System.out.println();

        printDetails(trucks);
        trucks.moveForward();
        trucks.moveBackward();
        trucks.moveLeft();
        trucks.moveRight();
        System.out.println();

        System.out.println("\n=== 3. Polymorphic Array ===");

        Vehicle[] vehicles = {
                new Car("Honda", "City", 2023, 4),
                new Motorcycle("Suzuki", "Raider R150", 2022,
                        "4-stroke, single-cylinder, liquid-cooled engine"),
                new Truck("Toyota", "Hilux", 2023, 4)
        };
        for (Vehicle currentVehicle : vehicles) {
            printDetails(currentVehicle);
            currentVehicle.moveForward();
            currentVehicle.moveBackward();
            currentVehicle.moveLeft();
            currentVehicle.moveRight();
            System.out.println();
        }
        System.out.println();
    }
}
