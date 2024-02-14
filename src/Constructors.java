public class Constructors {

    // Constructor = Special method that is called when an object is instantiated(Created);
    //               Constructors are useful because they allow us to use different attributes
    public static void main(String[] args) {

        // From Human constructor -> has name age and height
        Human human1 = new Human("Mo", 19, 93);
        Human human2 = new Human("Sara", 20, 75);
        // Pretend you are replacing this word with human
        System.out.println(human1.name);
        System.out.println(human2.name);

        // access a method from the constructor
        human1.eating();
        human2.hungary();


    }


}
