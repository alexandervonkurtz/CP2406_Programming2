public class Percentages {
    public static void main(String[] args){
        double valueOne = 3.0, valueTwo = 6.0;
        computePercent(valueOne,valueTwo);
    }
    private static void computePercent(double valueOne, double valueTwo){
        double percentage = (valueOne / valueTwo) * 100;
        int finalPercentage = (int) percentage;
        System.out.print(valueOne + " is " + finalPercentage + " percent of " + valueTwo);
    }

}