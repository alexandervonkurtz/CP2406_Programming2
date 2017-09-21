class IncomingPhoneCall extends PhoneCall{

    public IncomingPhoneCall(String phonenumber) {
        super(phonenumber);
        setPrice();
    }

    public void setPrice() {
        price = 0.02;
    }

    void incomingInfo() {
        System.out.println("Phone Number: " + getPhoneNumber() + " $" + getPrice());
    }
}