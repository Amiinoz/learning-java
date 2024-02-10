import java.util.ArrayList;

public class TwoDArrayList {

    public static void main(String[] args) {


        // 2 D ArrayList = a dynamic list of lists
        // You can change the size of this list during run time

        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("Bread");
        bakeryList.add("Cake");


        ArrayList<String> dairyList = new ArrayList<>();
        dairyList.add("Milk");
        dairyList.add("Eggs");
        dairyList.add("Cheese");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("Grapes");
        produceList.add("Apple");
        produceList.add("Banana");

        groceryList.add(bakeryList);
        groceryList.add(dairyList);
        groceryList.add(produceList);

//        System.out.println(groceryList);
        System.out.println(groceryList.get(0).get(1)); // Cake


        
    }
}
