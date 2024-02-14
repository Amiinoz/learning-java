import java.util.Random;

public class DiceRoller {
    // This is accessible to all (GLOBAL)
    Random random;
    int number;

    // Constructor
    DiceRoller(){
        // This is only accessible from the constructor (LOCAL)
//        Random random = new Random();
//        int number = 0;
        // roll method has access to the local variables
//        roll(random, number);

        random = new Random();
        roll();
    }

    // Method
//    void roll(Random random, int number){
//        number = random.nextInt(6)+1;
//        System.out.println(number);
//    }

    void roll(){
        number = random.nextInt(6)+1;
        System.out.println(number);
    }


}
