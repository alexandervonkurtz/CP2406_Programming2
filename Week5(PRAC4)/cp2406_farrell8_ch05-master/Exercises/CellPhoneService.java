import javax.swing.*;

public class CellPhoneService {
    //Prompt user for max talk minutes used
    //Prompt user for max text messages sent
    //Prompt user for gigabytes of data used
    //Recommended best plan for customer's needs
    //Customer who needs fewer than 500 mins of talk and no text = Plan A @ $49 a month
    //Customer who needs fewer than 500 mins of talk and any text = Plan B @ $55 a month
    //Customer who needs 500 or more of talk and no data = Plan C (100 txt msgs) @ $61 a month
    //or Plan D (100 txt msgs or more) @ $70 a month
    //Customer who needs any data = Plan E for up to 2 gigbytes @ $79 a month
    // or Plan F = 2 gigabytes data or more @ $87 a month
    public static void main (String args[]){
        int maxTalk, maxText, maxGig;
        String userTalk, userText, userGig;
        userTalk = JOptionPane.showInputDialog(null, "Please enter maximum monthly talk minutes used: ");
        maxTalk = Integer.parseInt(userTalk);
        userText = JOptionPane.showInputDialog(null, "Please enter maximum monthly text messages sent: ");
        maxText = Integer.parseInt(userText);
        userGig = JOptionPane.showInputDialog(null, "Please enter maximum gigabytes of data used: ");
        maxGig = Integer.parseInt(userGig);

        if (maxTalk < 500 && maxText == 0 && maxGig == 0){
            System.out.println("I recommend Plan A which will cost $49 per month");
        }
        else if (maxTalk < 500 && maxText >= 1 && maxGig == 0){
            System.out.println("I recommend Plan B which will cost $55 per month");
        }
        else if (maxTalk >= 500 && maxText <= 100 && maxGig == 0){
            System.out.println("I recommend Plan C which will cost $61 a month");
        }
        else if (maxTalk >= 500 && maxText >= 100 && maxGig == 0){
            System.out.println("I recommend Plan D which will cost $70 a month");
        }
        else if (maxGig >= 1 && maxGig <= 2){
            System.out.println("I recommend Plan E which will cost $79 a month");
        }
        else if (maxGig >= 2){
            System.out.println("I recommend Plan F which will cost $87 a month");
        }

    }
}
