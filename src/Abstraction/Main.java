package Abstraction;

public class Main {
    public static void main(String[] args) {

        // Abstract     =   Abstract(too generic) classes can not be instantiated, but they can have a subclass
        //                  abstract methods are declare without an implementation
        //                  Adds a layer of security to not using abstract classes Eg. Vehicle is abstract(too generic)




        Car car = new Car();
//    Vehicle vehicle = new Vehicle();
        car.go();
    }

}
