class OutgoingPhoneCall extends PhoneCall {
    int time;
    public OutgoingPhoneCall(String phonenumber , int time ) {
        super(phonenumber);
        setPrice();
        this.time = time;
    }

    public void setPrice() {
        price = 0.04;
    }

    void outgoingInfo() {
        System.out.println("Phone Number: " + getPhoneNumber() + " ,rate per min is $" + getPrice()+ " ,number of minutes is "+ time + " and total price is $" + (time*price));
    }
}