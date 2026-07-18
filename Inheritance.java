class Vehicle{
    int tyres;

    public Vehicle(int tyres){
        this.tyres = tyres;
    }

    void drive(){
        System.out.println("Driving with " + tyres + " tyres...");
    }

    void honk(){
        System.out.println("Honk Honk!");
    }
}

class Car extends Vehicle{
    public Car(){
        super(4);
    }
}

class Bike extends Vehicle{
    public Bike(){
        super(2);
    }
}

public class Inheritance{
    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();
        c.honk();
        b.drive();
    }
}