public class DebugMusical extends DebugPlay
{
   protected String composer;
   
   DebugMusical(String title, String author, String comp)
   {
      super(title,author);
      composer = comp;
   }
   public void display()
   {
      System.out.println("The performance is"  + theTitle +
        " by " + theAuthor + "\nThe music for " + theTitle +
        " is by " + composer);
   }
}