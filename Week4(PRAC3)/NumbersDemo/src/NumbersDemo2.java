import java.util.Scanner;

public class NumbersDemo2 {
    public static void main(String[] args){
        int integerOne = getIntegerOne(), integerTwo = getIntegerTwo();
        displayTwiceTheNumber(integerOne, integerTwo);
    }
    private static int getIntegerOne(){
        Scanner inputOne = new Scanner(System.in);
        System.out.print("Enter Integer One: " );
        return inputOne.nextInt();
    }
    private static int getIntegerTwo(){
        Scanner inputTwo = new Scanner(System.in);
        System.out.print("Enter Integer Two: " );
        return inputTwo.nextInt();
    }
    private static void displayTwiceTheNumber(int integerOne, int integerTwo){
        System.out.println("Integer One = " + integerOne + ",Double of Integer One = " + (integerOne * 2));
        System.out.println("Integer Two = " + integerTwo + ",Double of Integer Two = " + (integerTwo * 2));
    }
}