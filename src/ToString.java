public class ToString {

    public static void main(String[] args){

        // toString()  =  special method that all objects inherit
        //                that returns a string that "Textually presents" an object.
        //                Can be used both implicitly and explicitly

        Car car = new Car();

        // normal way
//        System.out.println(car.make);
//        System.out.println(car.model);
//        System.out.println(car.color);
//        System.out.println(car.year);


        // You car return both implicitly and explicitly once you override the car method

        System.out.println(car.toString());

        // or

        System.out.println(car); // Car@75b84c92 is the car address in the memory (like street address)
    }
}
