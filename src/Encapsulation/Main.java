package Encapsulation;

public class Main {
    public static void main(String[] args) {

        // Encapsulation    = Attribute of a class will be hidden or private,
        //                    can only be access through methods (getters & setters)
        //                    You should make attributes private if you don't have a reason to make them


        Car car = new Car("Toyota", "Carasida", 1999);

        car.setMake("Honda");

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());




    }
}
