public class OverLoadedConstructors {

    public static void main(String[] args) {

        // Overloaded Constructors =    Multiple constructors within a class with the same name,
        //                              but have a different parameters
        //                              name + parameters = Signature

        // 2. instantiate a pizza object
        // 5. Introduce the parameters "Light crust"
//        Pizza pizza = new Pizza("Light crust","Tomato", "Meet", "Mozzarella");
//        Pizza pizza = new Pizza("Light crust","Tomato", "Meet");
        Pizza pizza = new Pizza("Light crust","Tomato");



        System.out.println("Here are the ingredients to your Pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.topping);
        System.out.println(pizza.cheese);

    }
}
