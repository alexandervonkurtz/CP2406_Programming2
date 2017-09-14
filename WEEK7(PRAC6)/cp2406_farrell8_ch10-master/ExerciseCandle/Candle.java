public class Candle {

    //Candle data fields for color,height and price. Price is protected to be accessible within all classes
    private String color;
    private int height;
    double price;


    String getColor()
    {
        return color;
    }
    int getHeight()
    {
        return height;
    }
    double getPrice()
    {
        return price;
    }
    void setColor(String c)
    {
        color = c;
    }
    public void setHeight(int theHeight)
    {
        final double PER_INCH = 2;
        height = theHeight;
        price = height * PER_INCH;
    }
}
