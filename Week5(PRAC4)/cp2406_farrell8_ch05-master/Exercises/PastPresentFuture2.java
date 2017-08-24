import javax.swing.*;
import java.time.LocalDate;

public class PastPresentFuture2 {
    public static void main(String args[]){



        String userYearString, userMonthString, userDayString;
        userDayString = JOptionPane.showInputDialog(null, "Please enter a day: ");
        LocalDate day = LocalDate.parse(userDayString);
        userMonthString = JOptionPane.showInputDialog(null, "Please enter a month: ");
        LocalDate month = LocalDate.parse(userMonthString);
        userYearString = JOptionPane.showInputDialog(null, "Please enter a year: ");
        LocalDate year = LocalDate.parse(userYearString);
        System.out.println("DD/MM/YYYY: " + day + "/" + month + "/" + year);

        LocalDate daySet = LocalDate.parse("28");
        //LocalDate monthSet = LocalDate.parse("8");
        //LocalDate yearSet = LocalDate.parse("2017");

        if (day.isBefore(daySet)){
            System.out.println("Day is in future");
        }
        else if (day.isAfter(daySet)){
            System.out.println("Day is in the past");
        }
        else {
            System.out.println("Current day");
        }


    }
}
