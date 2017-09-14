public class DemoItemsAndPets {
    public static void main(String[] args) {
        ItemSold item1 = new ItemSold(2001,"Phone", 110.00f);
        PetSold dog = new PetSold(1002,"german shepherd",359.00f,true,true,true);

        System.out.println(item1.getDescription() + " was sold for $" + item1.getPrice());

        System.out.println("\nA " + dog.getDescription() + " was sold for $" + dog.getPrice());
        System.out.println("\nWhether the " + dog.getDescription() + " has been neutered : " + dog.isNeutered() +
                "\nAnd it is " + dog.isHousebroken() + " that the " + dog.getDescription() +" is housebroken");
    }
}
