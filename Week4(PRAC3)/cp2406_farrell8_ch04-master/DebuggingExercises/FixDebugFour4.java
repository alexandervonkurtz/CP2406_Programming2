// This class discounts prices by 10%
public class FixDebugFour4
{
   public static void main(String args[])
   {
      final double DISCOUNT_RATE = 0.90;
      int price = 100;
      double price2 = 100.00;
      tenPercentOff1(price, DISCOUNT_RATE);
      tenPercentOff2(price2, DISCOUNT_RATE);
   }
   public static void tenPercentOff1(int p, double DISCOUNT_RATE)
   {
      double newPrice = p * DISCOUNT_RATE;
      System.out.println("Ten percent off "  + p);
      System.out.println("  New price is " + newPrice);
   }
   public static void tenPercentOff2(double p, double DISCOUNT_RATE)
   {
      double newPrice = p * DISCOUNT_RATE;
      System.out.println("Ten percent off " + p);
      System.out.println("  New price is " + newPrice);
   }
}
