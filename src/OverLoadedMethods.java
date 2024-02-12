public class OverLoadedMethods {

    public static void main(String[] args) {

        // Overloaded methods = Are Methods that share the same name but have a different parameters
        //                      Method name + parameters = method signature

        // let's use those methods
//        int x = add(1,2);
//        System.out.println(x);
//        int x = add(1,2, 3);
//        System.out.println(x);

//        int x = add(1,2, 3, 4);

        double x = add(1.4, 1.6, 3.5, 4.4);

        System.out.println(x);
    }

    // declare methods outside  + should start with static + (" ")

    static int add(int a, int b){
        System.out.println("Now using -> Overloaded method 1");
        return a + b;
    }
//    this can share the same name, but must have different parameters
    static int add(int a, int b, int c){
        System.out.println("Now using -> Overloaded method 2");
        return  a + b + c;
    }
    static int add(int a, int b, int c, int d){
        System.out.println("Now using -> Overloaded method 3");
        return  a + b + c + d;
    }
    static double add(double a, double b){
        System.out.println("Now using -> Overloaded method 4");
        return a + b;
    }
    static double add(double a, double b, double c){
        System.out.println("Now using -> Overloaded method 5");
        return  a + b + c;
    }
    static  double add(double a, double b, double c, double d){
        System.out.println("Now using -> Overloaded method 6");
        return  a + b + c + d;
    }


}
