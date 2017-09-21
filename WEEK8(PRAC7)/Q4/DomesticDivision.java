class DomesticDivision extends Division
{
    private String stateLocation;

    DomesticDivision(String name, int accNum, String stateLocation) {
        super(name, accNum);
        this.stateLocation = stateLocation;
    }

    @Override
    void display() {
        System.out.println("Name : " + this.name);
        System.out.println("Account number : " + this.accNum);
        System.out.println("State Location : " + this.stateLocation);
        System.out.println();
    }

}