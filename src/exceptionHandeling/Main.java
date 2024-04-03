package exceptionHandeling;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Exception = An event that happens during the execution of the program
        //             that disrupts the normal follow of instructions

    try {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inter a number to divide: ");
        int x = scanner.nextInt();

        System.out.println("Inter another number to divide the first one: ");
        int y = scanner.nextInt();

        // tried to divide 0 = exception error -> to handle that you use try anc catch method.
        int z = x/y;

        System.out.println("The result is : " + z);
    }
    catch (ArithmeticException exception){
        System.out.println("Oh Snap, 0 is not divisible");
    }
    // Start this tom


    }
}
