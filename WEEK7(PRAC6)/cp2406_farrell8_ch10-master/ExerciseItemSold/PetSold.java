public class PetSold extends ItemSold {
    private boolean vaccinated;
    private boolean neutered;
    private boolean housebroken;

    PetSold(int invoiceNum, String description, float price, boolean vaccinated, boolean neutered, boolean housebroken) {
        super(invoiceNum, description, price);
        this.vaccinated = vaccinated;
        this.neutered = neutered;
        this.housebroken = housebroken;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    boolean isNeutered() {
        return neutered;
    }

    public void setNeutered(boolean neutered) {
        this.neutered = neutered;
    }

    boolean isHousebroken() {
        return housebroken;
    }

    public void setHousebroken(boolean housebroken) {
        this.housebroken = housebroken;
    }
}
