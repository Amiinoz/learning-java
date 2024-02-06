import java.util.Scanner;

public class Hypotenuse {

    public static void main(String[] args) {

        double x;
        double y;
        double z;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Inter side x: ");
        x = scanner.nextDouble();

        System.out.println("Inter side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x) + (y*y));

        System.out.println("The Hypotenuse of the triangle is: " + z);

        scanner.close();
    }
}
