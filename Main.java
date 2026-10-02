  
        
       
     
public class Main {

    public static void main(String[] args) {

                 Vehicle vehicle1 = new Vehicle("Toyota", "Corolla", 2020);
        Vehicle vehicle2 = new Vehicle("Ford", "Mustang", 1995);
        Vehicle vehicle3 = new Vehicle("Honda", "Civic", 2010);

                 vehicle1.displayInfo();
        System.out.println("Getters -> Brand: " + vehicle1.getBrand() + ", Model: " + vehicle1.getModel() + ", Year: " + vehicle1.getYear());
        System.out.println("Age: " + vehicle1.calculateAge());
        System.out.println("Vintage: " + vehicle1.isVintage());
        System.out.println();

         
        vehicle2.displayInfo();
        System.out.println("Getters -> Brand: " + vehicle2.getBrand() + ", Model: " + vehicle2.getModel() + ", Year: " + vehicle2.getYear());
        System.out.println("Age: " + vehicle2.calculateAge());
        System.out.println("Vintage: " + vehicle2.isVintage());
        System.out.println();

         
        vehicle3.displayInfo();
        System.out.println("Getters -> Brand: " + vehicle3.getBrand() + ", Model: " + vehicle3.getModel() + ", Year: " + vehicle3.getYear());
        System.out.println("Age: " + vehicle3.calculateAge());
        System.out.println("Vintage: " + vehicle3.isVintage());
        System.out.println();

         
        System.out.println("=== Testing setYear() on Vehicle 1 ===");
        
                 boolean test1 = vehicle1.setYear(2000);
        System.out.println(test1 + "; year is " + vehicle1.getYear() + "; age " + vehicle1.calculateAge() + "; vintage " + vehicle1.isVintage());

                boolean test2 = vehicle1.setYear(1885);
        System.out.println(test2 + "; year remains " + vehicle1.getYear());

         
        boolean test3 = vehicle1.setYear(2027);
        System.out.println(test3 + "; year remains " + vehicle1.getYear());
        System.out.println();

                 System.out.println("=== Testing Constructor Validation ===");

                Vehicle invalidVehicle1 = new Vehicle("Toyota", "Corolla", 1885);
        System.out.println("Initial year is " + invalidVehicle1.getYear());

                Vehicle invalidVehicle2 = new Vehicle("Toyota", "Corolla", 2027);
        System.out.println("Initial year is " + invalidVehicle2.getYear());
    }
}
