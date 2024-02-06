import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {

        // While loop = executes a block of code as long ad it's condition remain true

        Scanner scanner = new Scanner(System.in);

        String name = "";

        while(name.isEmpty()){
            System.out.println("Enter your name");
            name = scanner.nextLine();
        }
        System.out.println("Hello " + name);
    }
}
