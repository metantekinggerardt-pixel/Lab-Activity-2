public class Motorcycle extends Vehicle {
    String engineType;

    public Motorcycle(String brand, String model, int year, String engineType){
        super(brand,model,year);
        this.engineType = engineType;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Engine Type: " + engineType );
    }

    public void moveForward (){
        System.out.println("Motorcycle is moving Forward");
    }
    public void moveBackward (){
        System.out.println("Motorcycle is moving Backward");
    }
    public void moveLeft (){
        System.out.println("Motorcycle is moving Left");
    }
    public void moveRight (){
        System.out.println("Motorcycle is moving Right");
    }
}