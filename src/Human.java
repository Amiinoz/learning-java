public class Human {

    // This how to create a constructor within a class
    // Has the same name as the class
    // The parameters(rules) are name age and height

    // Declare your variables
    String name;
    int age;
    double height;

    Human(String name, int age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void eating(){
        System.out.println(this.name + " is eating");
    }
    void hungary(){
        System.out.println(this.name + " is very hungary");
    }

}
