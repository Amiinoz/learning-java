public class Methods {

    public static void main(String[] args) {

        // Method aka functions are  = a block of code that is executed when ever it's called upon
        String name = "Mo";
        int age = 23;
        int x = 3;
        int y = 4;

        int z = x + y;

        System.out.println(z);
        System.out.println(add(x,y));
        hello(name, age);
    }

    // Methods start with lower case letter
    // The parameter can take any name and does not have to match the string
    // you must have a matching set of parameters --> title title
    static void hello(String title, int age){
        System.out.println("Hello "+ title);
        System.out.println("you are "+ age);
    }
//    static void hello(String name){
//        System.out.println("Hello "+ name);
//    }

    static int add(int x, int y){
        int z = x + y;
        return z;
        // or
//        return x + y;
    }
}
