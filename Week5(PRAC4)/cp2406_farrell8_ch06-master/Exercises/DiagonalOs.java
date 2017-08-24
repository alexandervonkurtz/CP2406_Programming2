public class DiagonalOs {

    public static void main(String[] args)
    {

        int total = 10;

        for (int number = 0; number < total; number++)
        {
            for(int count = 0; count < number; count++)
            {
                System.out.print(" ");
            }
            System.out.println("0");
        }
    }
}