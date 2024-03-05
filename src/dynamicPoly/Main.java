package dynamicPoly;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Polymorphism = many shapes / forms
        // dynamic = after compilation (during runtime)

        // Example: a Mustang can be a car, a vehicle and object
        //          The ability to change to any of these after the
        //          program has run already is called dynamic polymorphism

        Scanner scanner = new Scanner(System.in);
        Animal animal;

        // Prompt the user to choose car or a dog
        System.out.println("What animal would you like?");
        System.out.print("(1 = Cat) or (2 = Dog) :");
        int choice = scanner.nextInt();

        if (choice == 1) {
            animal = new Cat();
            animal.speak();
        }else if ( choice == 2){
            animal = new Dog();
            animal.speak();
        } else {
            animal = new Animal();
            System.out.println("Invalid choice");
        }

    }
}
