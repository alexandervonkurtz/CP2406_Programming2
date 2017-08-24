import javax.swing.*;

//Declare SENTINEL as 999
//Declare number for input value
//Prompt user for input value
//Check that number is a whole number, if not display error and user re-enters number
//if number is 999 then exit
//if number is an even number then display "Good job!" otherwise display Error

public class EvenEntryLoop
{
   public static void main(String[] args) {

      final int SENTINEL = 999;
      int number;

      do {
         try {
            number = Integer.parseInt( JOptionPane.showInputDialog(
                    "Please enter an even number, or type 999 to stop."));
         } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog( null, "Error!! You did not enter a whole number!");
            continue;
         }
         if (number==SENTINEL) {
            System.exit(0);
         }
         if (number%2==0) {
            JOptionPane.showMessageDialog( null, "Good job!");
         } else {
            JOptionPane.showMessageDialog( null, "Error! You did not enter an even number!");
         }
      } while (true);

   }
}