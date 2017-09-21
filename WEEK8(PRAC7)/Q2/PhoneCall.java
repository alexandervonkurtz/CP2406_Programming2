abstract class PhoneCall {
    private String phonenumber;
    double price;

    public PhoneCall(String phonenumber) {
        this.phonenumber = phonenumber;
        this.price = 0.0;
    }

    public String getPhoneNumber() {
        return phonenumber;
    }

    public double getPrice() {
        return price;
    }

    public abstract void setPrice();
}