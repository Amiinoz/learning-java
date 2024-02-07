public class Arrays {

    public static void main(String[] args) {

        // Arrays are used to store multiple values in a single variable
//
//        String[] cars = {
//                "Tesla",
//                "Camero",
//                "Mustang"
//        };
//
//        cars[0] = "Carasida";
//
//        System.out.println(cars[1]);

        // Another way to declare arrays is
//
        String[] cars = new String[3];

        cars[0] = "Camero";
        cars[1] = "Tesla";
        cars[2] = "Carasida";
//
        System.out.println(cars[2]);


        // This is how to itterate trough a arrray using if statement

        for(int i = 0; i<cars.length; i++) {
            System.out.println(cars[i]);
        }

    }
}
