public class ItemSold {

    //fields include an invoice number, description and price
    private int invoiceNum;
    private String description;
    private float price;

    ItemSold(int invoiceNum, String description, float price) {
        this.invoiceNum = invoiceNum;
        this.description = description;
        this.price = price;
    }

    //create get and set methods for each field
    public int getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(int invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
