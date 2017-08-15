import javax.swing.JOptionPane;
public class InchesToFeetInteractive {
    public static void main (String[] args)
    {
        String inchesInput;
        double inches;
        inchesInput = JOptionPane.showInputDialog(null,"Enter total amount of inches to convert", "Inches to convert",
                JOptionPane.INFORMATION_MESSAGE);;
        inches = Double.parseDouble(inchesInput);
        System.out.print(inches + " inches" + " = ");
        System.out.println (String.format("%.1f", (inches / 12)) + " feet");
    }
}
