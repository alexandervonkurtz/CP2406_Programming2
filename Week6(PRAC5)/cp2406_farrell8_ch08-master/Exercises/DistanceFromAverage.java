import java.util.ArrayList;
import java.util.Scanner;

public class DistanceFromAverage {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        String num;
        double sum = 0.0, average = 0.0;

        int count = 0;

        ArrayList<Double> numbers = new ArrayList<>();
        System.out.println("Enter any number. Type 99999 To stop");

        do {
            num = input.nextLine();
            if (num.length() == 0){
                System.out.println("Error!! you have not entered anything");
                System.exit(1);
            }
            else {
                if (Double.parseDouble(num) > 20.0)
                    System.out.println("Enter a number upto 20");
                else{
                    numbers.add(Double.parseDouble(num));
                    sum = sum + Double.parseDouble(num);
                    count ++;
                }
            }
        } while (!num.equals("99999"));
        average = sum / count;
        System.out.println ("Average is: " + (Math.round(average*100) / 100.0));

        for (double val:numbers){
            System.out.println ("The value " + val + " is at a distance of " + (Math.round((val - average) * 100) / 100.0) + " from average");
        }
    }
}