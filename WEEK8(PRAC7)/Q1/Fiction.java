public class Fiction extends Book {

    Fiction(String title) {
        super(title);
        setPrice(24.99);
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Title = " + title + " and Price = $" + price;
    }
}