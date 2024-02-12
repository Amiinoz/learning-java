public class PrintF {

    public static void main(String[] args) {


        // printf() =   An optional method to control, format and display text to the console window
        //              two arguments = format string + ( object / variable / value)
        //              % [flags] [precision] [width] [conversion-character]

//        System.out.printf("This is the format string %d", 123); // This is the format string 123

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Mo";
        int myInt = 30;
        double myDouble = 1000;

        // [conversion-character]
        System.out.printf("%b", myBoolean);
        System.out.printf("%c", myChar);
        System.out.printf("%s", myString);
        System.out.printf("%d", myInt);
        System.out.printf("%f", myDouble);

        // [width]
        // Minimum number of characters  to be written as output
        System.out.printf("Hello %10s", myString);

        // [precision]
        // Sets number of digits of precision when outputting floating point of value
        System.out.printf("You have this much of money %.2f", myDouble);


        // [flags]
        // Add an effect to output based on the flag added to format the specifier
        // - : left-justify
        // + : outputs + or - sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if number is < 1000

        System.out.printf("You have this much of money %-20f", myDouble);
        System.out.println();
        System.out.printf("You have this much of money %+20f", myDouble);
        System.out.println();
        System.out.printf("You have this much of money %020f", myDouble);
        System.out.println();
        System.out.printf("You have this much of money %,f", myDouble);






    }
}
