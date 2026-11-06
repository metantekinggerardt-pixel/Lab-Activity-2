public class Truck extends Vehicle {
    int numberofWheels;

    Truck(String brand, String model, int year, int numberofWheels){
        super(brand, model, year);
        this.numberofWheels = numberofWheels;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Number of Wheels: " + numberofWheels);
    }

    public void moveForward (){
        System.out.println("Truck is moving Forward");
    }
    public void moveBackward (){
        System.out.println("Truck is moving Backward");
    }
    public void moveLeft (){
        System.out.println("Truck is moving Left");
    }
    public void moveRight (){
        System.out.println("Truck is moving Right");
    }
}