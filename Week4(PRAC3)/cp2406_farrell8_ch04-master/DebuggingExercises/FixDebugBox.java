public class FixDebugBox
{
   private int width;
   private int length;
   private int height;
   public FixDebugBox()
   {
      length = 1;
      width = 1;
      height = 1;
   }
   public FixDebugBox(int width1, int length1, int height1)
   {
      width = width1;
      length = length1;
      height = height1;
   }
   public void showData()
   {
     System.out.println("Width: "  + width + "  Length: " +
       length + "  Height: " + height);
   }
   public double getVolume()
   {
      return (double) (length * width * height);
   }
}
