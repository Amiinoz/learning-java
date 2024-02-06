public class SwitchStatements {

    public static void main(String[] args) {

        // Switch = statement that allows variables to be tested for equality against list of values
        String day = "Friday";

        switch(day){
            case "Sunday":
                System.out.println("It's a Sunday");
                break;
            case "Monday":
                System.out.println("It's a Monday");
                break;
            case "Tuesday":
                System.out.println("It's a Tuesday");
                break;
            case "Wednesday":
                System.out.println("It's a Wednesday");
                break;
            case "Thursday":
                System.out.println("It's a Thursday");
                break;
            case "Friday":
                System.out.println("It's a Friday");
                break;
            case "Saturday":
                System.out.println("It's a Saturday");
                break;

            default:
                System.out.println("That is not a day of the week");


        }
    }
}
