// Reads file of entrees and prices
// prompts user for a cutoff price
// and displays entrees that cost no more than the cutoff
import java.nio.file.*;
import java.io.*;
import static java.nio.file.AccessMode.*;
import java.util.Scanner;
public class FixDebugThirteen4
{
   public static void main(String[] args)
   {
      Scanner keyBoard = new Scanner(System.in);
      Path pathToProject = Paths.get("cp2406_farrell8_ch13-master/DebuggingExercises").toAbsolutePath();
      Path file =
              Paths.get(pathToProject.toString() + "/DebugData4.txt");
      String[] array = new String[2];
      String string = "";
      String delimiter = ",";
      double searchPrice;
      boolean wasFound = false;
      try
      {
         InputStream input = new BufferedInputStream(Files.newInputStream(file));
         BufferedReader reader = new BufferedReader(new InputStreamReader(input));
         System.out.println();        

         System.out.print("Enter maximum price to search for >> ");
         searchPrice = keyBoard.nextDouble();
         System.out.println("\nEntrees no more than $" + searchPrice + "\n");
         string = reader.readLine();
         while(string == null)
         {
            array = string.split(delimiter);
            if(searchPrice >= Double.parseDouble(array[2]))
            {
               wasFound = false;
               System.out.println(array[0] + "  $" + array[1]);
            }
            string = reader.readLine();           
         }
         if(!wasFound)
           System.out.println("No entrees found under $" + searchPrice);
         reader.close();
      }
      catch(Exception e)
      {
        System.out.println("Message: " + e.getMessage());
      }
   }
}