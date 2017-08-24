import java.util.Scanner;

public class Factorial
{
   public static void main(String args[])
   {
      int number, count, factorial = 1;

      System.out.println("Enter an integer between 1 and 10 to calculate it's factorial");
      Scanner in = new Scanner(System.in);

      number = in.nextInt();

      if ( number < 0 )
         System.out.println("Number should not be a negative number.");
      else if (number >= 1 && number <= 10){
          for ( count = 1 ; count <= number ; count++ )
              factorial = factorial*count;
          System.out.println("Factorial of "+number+" is = "+factorial);
      }
      else
      {
          System.out.println("Number is required to be between 1 and 10");
      }
   }
}