package methodOveriding;

public class Cat extends Animal{

    // Method overriding by given this class the inherited method that is unique to this class
    @Override
    void speak(){
        System.out.println("The cat *Meows* ");
    }
}
