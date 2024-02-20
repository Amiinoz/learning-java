public class ObjectPassing{


    // How to pass objects as arguments to a method
    // Create a ride with method and string name
    // pass it to garage and use it here

    public static void main(String[] args) {

        Garage garage = new Garage();


        Ride ride1 = new Ride("BNZ");
        Ride ride2 = new Ride("BMW");

        garage.park(ride1);
        garage.park(ride2);
    }
}
