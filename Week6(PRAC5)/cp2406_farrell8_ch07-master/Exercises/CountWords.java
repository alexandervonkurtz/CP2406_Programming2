import java.util.Scanner;

public class CountWords {
    static public void main(String args[]){
        int count = 0;
        boolean word = false;
        String sentence;
        Scanner scanner = new Scanner(System.in);
        System.out.println("I am designed to count how many words you have in a sentence\n");
        System.out.print("Please enter a sentence: ");
        sentence = scanner.nextLine();

        for(int i = 0; i < sentence.length(); i++)
        {
            char character = sentence.charAt(i);
            if(Character.isLetter(character) && i != sentence.length() -1){
            word = true;
        }
        else if(!Character.isLetter(character) && word){
            count++;
            word = false;
        }
        else if (Character.isLetter(character) && i == sentence.length()-1){
            count++;
        }
        }
        System.out.println("You have " + count + " words in your sentence.");
    }
}
