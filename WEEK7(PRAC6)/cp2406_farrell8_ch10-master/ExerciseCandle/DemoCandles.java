
//Write an application that instantiates an object of each type and displays the details

public class DemoCandles {
    public static void main(String args[])
    {
        Candle aCandle = new Candle();
        ScentedCandle aScentedCandle = new ScentedCandle();
        aCandle.setColor("white");
        aCandle.setHeight(12);
        aScentedCandle.setColor("red");
        aScentedCandle.setScent("rose");
        aScentedCandle.setHeight(9);
        System.out.println("The " + aCandle.getHeight() + " inch " + aCandle.getColor() + " candle costs $"
                + aCandle.getPrice());
        System.out.println("The " + aScentedCandle.getHeight() + " inch " + aScentedCandle.getColor() + " "
                + aScentedCandle.getScent() +
                " candle costs $" + aScentedCandle.getPrice());


    }
}
