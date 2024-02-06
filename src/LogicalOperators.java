import java.util.Scanner;

public class LogicalOperators {

    public static void main(String[] args) {

        // Logical Operators = used to connect 2 or more expressions
        //    && = (AND) both conditions must be met
        //   || = (OR) either condition must be true
        //   ! = (NOT) reverses boolean value of a condition


        //    && = (AND) both conditions must be met
//        int temp = 31;
//
//        if(temp > 30){
//            System.out.println("It is hot outside");
//        }
//            else if( temp >= 20 && temp<=30){
//                System.out.println("It's warm outside");
//            }
//       else {
//            System.out.println("it is cold outside");
//        }


        //   || = (OR) either condition must be true
        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game");
        String response = scanner.next();

        if(response.equals("q") || response.equals("Q")) {
            System.out.println("You quit the game");
        }
        else {
            System.out.println("You still playing the game");
        }


    }
}
