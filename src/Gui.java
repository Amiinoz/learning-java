import javax.swing.JOptionPane;


public class Gui {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null,"Hello" + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your Age"));
        JOptionPane.showMessageDialog( null,"Your are " + age + "years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Inter your height"));
        JOptionPane.showMessageDialog(null, "You are " + height + "cm tall");





    }
}
