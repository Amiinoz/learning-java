package polymorphism;

import Abstraction.Vehicle;

public class Main {

    public static void main(String[] args) {

        // Polymorphism     = greek word for poly-"many", morph-"form"
        //                    The ability of an object to identify as more than one type


        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        // these classes are both vehicle and Car or boat...
        // Array of vehicles
//        Vehicle[] racers = {car,bike,boat};
        TransPort[] racers = {car, bike, boat};

        // x = vehicle
        for(TransPort x : racers) {
            x.go();
        }

    }
}
