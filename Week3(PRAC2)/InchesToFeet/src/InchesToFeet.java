public class InchesToFeet {
    public static void main (String[] args)
    {
        double inches = 86;
        System.out.print(inches + " inches" + " = ");
        System.out.println (String.format("%.1f", (inches / 12)) + " feet");
    }
}
