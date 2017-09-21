public class NonFiction extends Book{

    NonFiction(String title) {
        super(title);
        setPrice(37.99);
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public String toString(){
        return "Title = " + title + " and Price = $" + price;
    }
}