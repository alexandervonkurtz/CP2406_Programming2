// This application displays some math facts
public class FixDebugThree2
{
   public static void main(String args[])
   {
      int a = 2, b = 5, c = 10;
      add1(a,b);
      add2(b,c);
      subtract(c,a);
   }
   private static void add1(int a, int b)
   {
      System.out.println("The sum of " + "a and b is " + (a + b));
   }
    private static void add2(int b, int c)
    {
        System.out.println("The sum of " + "b and c is " + (b + c));
    }
   private static void subtract(int c, int a)
   {
      //I assume this is meant to read "The difference between a and c not a and b"
      System.out.println("The difference between " +
        "a and c is " + (c - a));
   }
}
