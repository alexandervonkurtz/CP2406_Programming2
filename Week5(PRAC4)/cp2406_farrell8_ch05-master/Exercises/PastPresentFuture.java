// DebugFive1
// Adds your lunch bill
// Burger and hot dog are $2.59
// Grilled cheese and fish are $1.99
// Fries are 89 cents
import javax.swing.*;
import java.util.Calendar;

public class PastPresentFuture
{
   public static void main(String args[]) {
       Calendar now = Calendar.getInstance();
       int month, day, year;
       int thisMonth = now.get(Calendar.MONTH) + 1;
       // thisDay not used in question (to specify correct day) however can be added if required
       // /int thisDay = now.get(Calendar.DAY_OF_MONTH);
       int thisYear = now.get(Calendar.YEAR);
       String userYearString, userMonthString, userDayString;
       //as required user is prompted for day even though day is not checked in "if" statement
       userDayString = JOptionPane.showInputDialog(null, "Please enter a day: ");
       day = Integer.parseInt(userDayString);
       userMonthString = JOptionPane.showInputDialog(null, "Please enter a month: ");
       month = Integer.parseInt(userMonthString);
       userYearString = JOptionPane.showInputDialog(null, "Please enter a year: ");
       year = Integer.parseInt(userYearString);
       System.out.println("DD/MM/YYYY: " + day + "/" + month + "/" + year);
       if (year < thisYear || year > thisYear) {
           System.out.println("not this year");
       }
       else {
           System.out.println("this year");
       }
       if (month < thisMonth){
           System.out.println("in a later month this year");
       }
       else if (month > thisMonth){
           System.out.println("in a earlier month this year");
       }
       else {
           System.out.println("this month");
       }
   }
}
