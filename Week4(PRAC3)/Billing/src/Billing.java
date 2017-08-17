public class Billing {
    public int price;
    public int quantity;
    public int coupon;
    public double tax;

    public static void main(String[] args){
        Billing test1 = new Billing();
        Billing test2 = new Billing();
        Billing test3 = new Billing();
        test1.computeBill(100, 0.08);
        test2.computeBill(100,2, 0.09);
        test3.computeBill(100, 3, 0.05, 20);
    }
    public void computeBill(int price1, double tax1){
        price = price1;
        tax = tax1;
        System.out.println("The Price for one book is $" + price + " with a tax value of " + tax);
        System.out.println("The Total due is: $" + ((price * tax) + price));
        System.out.println("");
    }

    public void computeBill(int price1, int quantity1, double tax1){
        price = price1;
        quantity = quantity1;
        tax = tax1;
        int total = price * quantity;
        System.out.println("The Price for " + quantity + " books with a tax value of " + tax + " is $" + ((price * tax) + total));
        System.out.println("");
    }

    public void computeBill(int price1, int quantity1, double tax1, int coupon1){
        price = price1;
        quantity = quantity1;
        tax = tax1;
        coupon = coupon1;
        int total = price * quantity;
        double totalAfterCoupon = total - coupon;

        System.out.println("The Price minus the coupon value is: $" + totalAfterCoupon);
        System.out.println("The Price inclusive of a tax value of " + tax + " is $" + ((totalAfterCoupon * tax) + totalAfterCoupon));
    }


}
