public class TwoDArrays {

    public static void main(String[] args) {

        // 2D Arrays aka array of Arrays
        // [] = row [] = column
//        String[][] cars = new String[3][3];
//
//        cars[0][0] = "Mustang";
//        cars[0][1] = "Tesla";
//        cars[0][2] = "F-150";
//
//        cars[1][0] = "Deth";
//        cars[1][1] = "Dfr";
//        cars[1][2] = "F-Fjkl";
//
//        cars[2][0] = "LKJL";
//        cars[2][1] = "LJLKJ";
//        cars[2][2] = "F-LKJLK";

        // Another way to declare the 2D array is
        String[][] cars = {{"Fors", "frs", "dfklkj"}, {"tlkjgl", "dlfkjlj", "lkjfladskj"}, {"lkjlkjsdf", "lkjlfdsakj", "lkjlkjfads"}};

        // Display array properties in a nested for loop
        // Outer loop
        for(int i = 0; i < cars.length; i++ ){
            // get empty line print sout
            System.out.println();
            // inner loop
            for(int j = 0; j < cars[i].length; j++){
                System.out.print(cars[i][j]+ " ");
            }
        }














//        String[][] cars = {"Mustang", "Carasida", "Silveradp"},{"Tesla", "Cdf", "f-150"},{"Dfr", "frt", "fre"};







    }
}
