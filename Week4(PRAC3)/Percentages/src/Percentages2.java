import java.util.Scanner;

public class Percentages2 {
    public static void main(String[] args){
        double valueOne = inputOne(), valueTwo = inputTwo();
        computePercent(valueOne,valueTwo);
    }
    // input classes as doubles to replicate the original tasks input values
    private static double inputOne(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Value: ");
        return input.nextDouble();
    }
    private static double inputTwo(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Second Value: ");
        return input.nextDouble();
    }
    private static void computePercent(double valueOne, double valueTwo){
        double percentage = (valueOne / valueTwo) * 100;
        int finalPercentage = (int) percentage;
        System.out.print(valueOne + " is " + finalPercentage + " percent of " + valueTwo);
    }

}