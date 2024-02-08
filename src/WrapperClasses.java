public class WrapperClasses {

    public static void main(String[] args){

//        Wrapper Class = provides a way to use primitive data types as reference data types
//                        Reference data types contain useful methods
//                        Can be used with collections (ex. ArrayList)



//        Primitive data type           Wrapper
//        ==================           ===========
//        boolean                       Boolean
//        char                          Character
//        int                           Integer
//        double                        Double

        // *** Strings are already reference daya types


        // Autoboxing = The automatic conversion that the java compiler makes between the primitive types and their corresponding object wrapper classes
        // Unboxing = The reverse of autoboxing. Automatic conversion wrapper class to primitive

        //Autoboxing
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.34;
        String e = "Mo";

        // Unboxing
        // You can still treat this Reference types as they where a primitive types
        if(a == true){
            System.out.println("This is true");
        }



    }
}
