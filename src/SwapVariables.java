
    public class SwapVariables {
        public static void main(String[] args) {

            String x = "Water";
            String y = "Tea";
            String temp = null;

            temp = x;
            x = y;
            y=temp;


            System.out.println("x: " + x);
            System.out.println("y: " + y);

        }
    }

