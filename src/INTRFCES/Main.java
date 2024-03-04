package INTRFCES;

public class Main {
    public static void main(String[] args) {

        // Interface =  a Template that can be applied to a class
        //              similar to inheritance, but specifies what a class has must do
        //              Classes can apply more than one interface, inheritance is limited to 1 super

        Rabbit rabit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

       fish.chase();
       fish.flee();

       hawk.chase();

       rabit.flee();


    }
}
