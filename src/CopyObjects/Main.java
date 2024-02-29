package CopyObjects;

public class Main {
    public static void main(String[] args) {


        Car car1 = new Car("Toyota", "Carola", 2020);
        Car car2 = new Car("Ford", "Mustang", 2023);

        // Wrong way to copy  = Both cars will have the same address
        // car1 = car2; // CopyObjects.Car@75b84c92 CopyObjects.Car@75b84c92

        // The right way
        // 1.
        car2.copy(car1);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());




    }
}
