public class Car extends Vehicle{
    int numberofDoors;

public Car(String brand, String model, int year,int numberofDoors){
    super(brand,model,year);
    this.numberofDoors = numberofDoors;
}

    @Override
   public void displayInfo(){
        super.displayInfo();
        System.out.println("Number of Doors: " + numberofDoors);
    }

    public void moveForward (){
        System.out.println("Car is moving Forward");
    }
    public void moveBackward (){
        System.out.println("Car is moving Backward");
    }
    public void moveLeft (){
        System.out.println("Car is moving Left");
    }
    public void moveRight (){
        System.out.println("Car is moving Right");
    }
}

