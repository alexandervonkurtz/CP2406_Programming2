public class DebugPlay
{
   public String theTitle;
   public String theAuthor;

   public DebugPlay(String title, String author)
   {
      theTitle = title;
      theAuthor = author;
   }
   public void display()
   {
      System.out.println("The performance is " + theTitle +
        " by " + theAuthor);
   }
}