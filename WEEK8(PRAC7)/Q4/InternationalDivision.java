class InternationalDivision extends Division
{
    private String location;
    private String language;

    InternationalDivision(String name, int accNum, String location, String language) {
        super(name, accNum);
        this.location = location;
        this.language = language;
    }

    @Override
    void display() {
        System.out.println("Division Name : " + this.name);
        System.out.println("Division Account number : " + this.accNum);
        System.out.println("Division Location : " + this.location);
        System.out.println("Division Language Spoken : " + this.language);
        System.out.println();
    }
}