public class ScentedCandle extends Candle {
    private String scent;
    String getScent()
    {
        return scent;
    }
    public void setScent(String scent)
    {
        this.scent = scent;
    }

    //Overide the parent's setHeight() method to set the price of a ScentedCandle object at $3 per inch
    @Override
    public void setHeight(int theHeight)
    {
        final double PER_INCH = 3;
        super.setHeight(theHeight);
        price = theHeight * PER_INCH;
    }
}
