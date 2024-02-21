package inheritance;

public class Main {

    public static void main(String[] args) {


        // Inheritance =    The process where one class acquires,
        //                  the attributes and methods of another

        Car car = new Car();
        car.go(); //The vehicle is moving

        Bicycle bike = new Bicycle();
        bike.stop(); //The vehicle is stopped


        System.out.println(bike.speed); // 0.0


        System.out.println(car.doors); // 4
        System.out.println(bike.wheels); // 2


    }
}
