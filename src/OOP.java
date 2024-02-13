public class OOP {

    public static void main(String[] args) {

        // Object = an instance of a class that may contain attributes and methods
        //          Example: (Phone, Computer, Desk)


        //          Attributes = Characteristics this object has
        //              Example:  A cup of coffee
        //                        String color = "Black";
        //                        double temp = 90.0
        //                        boolean full = true;


        //          Methods = Different Actions this object can perform
        //              Example:  A cup of coffee
        //                        drink() {System.out.print("You drink the coffee")
        //                        spill() {System.out.print("You spill the coffee")


        //  This is how you construct an instance of another class

        Car mycar = new Car();
        System.out.println(mycar.model);
        System.out.println(mycar.make);
        System.out.println(mycar.year);
        System.out.println(mycar.Color);
        System.out.println(mycar.price);






    }

    public static class Car {

        // Attributes
        String make = "MB";
        String model ="e63";
        String Color = "Black";
        int year = 2023;
        double price = 50000.00;
    }


}
