import java.util.Random;

public class GenerateRandomValues {

    public static void main(String[] args) {

        Random random = new Random();

//        Get a random num between 0 to 6
        int x = random.nextInt(6)+1;

//        Get a num between 0 and 1
        double y = random.nextDouble();

//        Get random true or false
        boolean z = random.nextBoolean();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
