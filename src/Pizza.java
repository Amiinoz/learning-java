public class Pizza {

    // 3. Declare your Global variables
    String bread;
    String sauce;
    String cheese;
    String topping;


    Pizza(String bread, String sauce){

        this.bread = bread;
        this.sauce = sauce;



    }

    Pizza(String bread, String sauce, String topping){

        this.bread = bread;
        this.sauce = sauce;
        this.topping = topping;


    }


    // 1 . constructor -> same name as the class
    // 4. Setup your parameters -> String bread, String sauce, String topping
    Pizza(String bread, String sauce, String topping, String cheese){

        this.bread = bread;
        this.sauce = sauce;
        this.topping = topping;
        this.cheese = cheese;

    }

}
