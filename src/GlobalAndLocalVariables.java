public class GlobalAndLocalVariables {

    public static void main(String[] args) {

        // local = declare inside a method
        //         visible only to that method

        // global = declare outside a method, but within a class
        //          visible to all parts of a class

        DiceRoller diceRoller = new DiceRoller();
        System.out.println(diceRoller);
    }
}
