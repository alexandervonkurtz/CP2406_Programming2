public class PhoneCallArray {
    public static void main(String[] args){
        //array that stores 10 calls
         PhoneCall calls[] = new PhoneCall[10];

        //store 5 fiction books/objects
        calls[0] = new IncomingPhoneCall("123");
        calls[1] = new IncomingPhoneCall("1234");
        calls[2] = new IncomingPhoneCall("12345");
        calls[3] = new IncomingPhoneCall("123456");
        calls[4] = new IncomingPhoneCall("1234567");

        //store 5 non-fiction book/objects
        calls[5] = new OutgoingPhoneCall("321", 10);
        calls[6] = new OutgoingPhoneCall("4321", 20);
        calls[7] = new OutgoingPhoneCall("54321", 30);
        calls[8] = new OutgoingPhoneCall("654321", 40);
        calls[9] = new OutgoingPhoneCall("7654321", 50);

        //using a loop, display the details of all the books in the array
        for(int i = 0; i < calls.length; i++) {
            System.out.println("--------------------------");
            System.out.println((i + 1) + ". Call: " + calls[i].getPhoneNumber());
            System.out.println("Price: $" + calls[i].getPrice());

        }
    }
}
