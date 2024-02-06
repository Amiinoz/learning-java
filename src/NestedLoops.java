import javax.swing.text.Style;
import java.util.Scanner;

public class NestedLoops {

    public static void main(String[] args) {

        // Nested loop = loop inside a loop

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter # of rows: ");
        rows = scanner.nextInt();

        System.out.println("Enter # of columns: ");
        columns = scanner.nextInt();

        System.out.println("Enter symbol to use: ");
        symbol = scanner.next();

        // outer loop
        for(int i = 1; i<=rows; i++) {
            System.out.println();
            // inner loop
            for(int j = 1; j<=columns; j++){
                System.out.print(symbol);
            }
        }





    }
}
