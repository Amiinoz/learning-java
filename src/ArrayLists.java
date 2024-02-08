import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {

        //ArrayList = A resizable array
        //            Elements can be added or removed after compilation phase
        //           Only Stores reference data types

        // Steps to create ArrayList
        // 1. Declare arraylist and import util class
        ArrayList<String> food = new ArrayList<String>();
        // 2. Add your elements
        food.add("Pizza");
        food.add("Pasta");
        food.add("Rice");
        food.add("Meat");

        // ======= *** ArrayList Useful methods
        food.set(0, "sushi");
        food.remove(2);
        food.clear();

        // 3. Display with for loop
        for(int i=0; i<food.size(); i++){
            System.out.println(food.get(i));



        }



    }
}
