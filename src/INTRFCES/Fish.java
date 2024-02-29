package INTRFCES;

import java.sql.SQLOutput;

public class Fish implements Prey, Predator{

    @Override
    public void chase() {
        System.out.println("*Chasing for smaller fish*");
    }

    @Override
    public void flee() {
        System.out.println("*Fleeing from bigger fish*");
    }
}
