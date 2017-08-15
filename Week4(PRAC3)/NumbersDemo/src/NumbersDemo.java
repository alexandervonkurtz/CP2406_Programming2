public class NumbersDemo {
    public static void main(String[] args){
        int integerOne = 10, integerTwo = 20;
        displayTwiceTheNumber(integerOne, integerTwo);
    }
    private static void displayTwiceTheNumber(int integerOne, int integerTwo){
        System.out.println("Integer One = " + integerOne + ",Double of Integer One = " + (integerOne * 2));
        System.out.println("Integer Two = " + integerTwo + ",Double of Integer Two = " + (integerTwo * 2));
    }
}
