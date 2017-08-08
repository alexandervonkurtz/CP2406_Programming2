import javax.swing.JOptionPane;
public class NauticalMilesInteractive {
    public static void main (String[] args)
    {
        String nautMilesInput;
        double nautMiles;
        double kilometers = 1.852;
        double miles = 1.150779;
        nautMilesInput = JOptionPane.showInputDialog(null,"Enter total amount of nautical miles to convert", "Nautical Miles to convert",
                JOptionPane.INFORMATION_MESSAGE);;
        nautMiles = Double.parseDouble(nautMilesInput);
        System.out.println(nautMilesInput + " nautical mile/s = " + (nautMiles * kilometers) + " kilometers");
        System.out.println(nautMilesInput + " nautical mile/s = " + (nautMiles * miles) + " miles");
    }
}
