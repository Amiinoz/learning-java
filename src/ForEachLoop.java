import java.util.ArrayList;

public class ForEachLoop {

    public static void main(String[] args){

        // For Each =  traversing technique to iterate through the elements in Array / Collection
        //             less steps, more readable
        //             less flexible


         // Array
//         String[] animals = {"Cat", "Dog", "Rat", "Bird"};

        // Collection
        ArrayList<String> animals = new ArrayList<String>();

        animals.add("Cat");
        animals.add("Dog");
        animals.add("Rat");
        animals.add("Bird");
         for(String i : animals) {
             System.out.println(i);
         }





//        ArrayList<String> animals = new ArrayList<String>();
    }




}
