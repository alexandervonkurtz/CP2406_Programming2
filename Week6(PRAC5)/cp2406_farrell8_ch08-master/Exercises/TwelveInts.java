public class TwelveInts {
    public static void main(String args[]) {

        int[] integers = {1,2,3,4,5,6,7,8,9,10,11,12};
        System.out.println("First list is from First to Last");
        for (int index = 0; index < integers.length; index++){
            System.out.print(integers[index] + " ");

        }
        System.out.println("\n");
        System.out.println("Now to display list from Last to First");
        for (int last = integers.length-1; last >= 0 ; last--){
            System.out.print(integers[last] + " ");
        }

    }
}