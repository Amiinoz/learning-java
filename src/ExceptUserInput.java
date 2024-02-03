import java.util.Scanner;

public class ExceptUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();

        System.out.println("Waht is your age? ");
        int age = scanner.nextInt();

        // To prevent the scanner skipping next line we call
        scanner.nextLine();

        System.out.println("Who is your favorite team?");
        String footballTeam = scanner.nextLine();



        System.out.println("Hello, " + name);
        System.out.println("Your are? " + age );
        System.out.println("Your favorite team is " + footballTeam);
    }
}
