import java.util.Scanner;

public class BabyNameComparison {
    public static void main(String[] args) {

    Scanner inputtedName = new Scanner(System.in);
    String firstName;
    String secondName;
    String thirdName;

    System.out.print("Please Enter the first name: ");
    firstName = inputtedName.nextLine();
    System.out.print("Please Enter the second name: ");
    secondName = inputtedName.nextLine();
    System.out.print("Please Enter the third name: ");
    thirdName = inputtedName.nextLine();

    //Because we have only 3 names, the first name would have the second name and third name as
    //the last name, therefore we can only have 6 possible combinations
    String combo1 = firstName.concat(" " + secondName);
    String combo2 = firstName.concat(" " + thirdName);
    String combo3 = secondName.concat(" " + firstName);
    String combo4 = secondName.concat(" " + thirdName);
    String combo5 = thirdName.concat(" " + firstName);
    String coombo6 = thirdName.concat(" " + secondName);

    /*We could also just combine the two like this however the task requires to concatenate:
    System.out.println(firstName + " " + secondName);*/

    System.out.println("Possible baby names based on your three inputted name are:");
    System.out.println(combo1);
    System.out.println(combo2);
    System.out.println(combo3);
    System.out.println(combo4);
    System.out.println(combo5);
    System.out.println(coombo6);
    }
}