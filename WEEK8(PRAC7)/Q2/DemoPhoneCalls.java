public class DemoPhoneCalls {

    public static void main(String[] args) {
        IncomingPhoneCall incoming = new IncomingPhoneCall("07 47 744 444");
        OutgoingPhoneCall outgoing = new OutgoingPhoneCall("07 47 755 555", 20);
        incoming.incomingInfo();
        outgoing.outgoingInfo();
    }
}