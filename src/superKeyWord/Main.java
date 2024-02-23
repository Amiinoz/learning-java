package superKeyWord;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main {
    public static void main(String[] args) {

        // super    = Keyword refers to the super class parent of an object
        //            Similar to this keyword

        Hero hero1 = new Hero("Ibro", 9, "Speed");
        Hero hero2 = new Hero("Abdul", 12, "Strength");

        System.out.println(hero1.toString());
        System.out.println(hero2.toString());

    }
}
