public class UsePackage {
    public static void main(String[] args)
    {
        Package packageOne = new Package(9, 'A');
        packageOne.display();
        Package packageTwo = new Package(8, 'T');
        packageTwo.display();
        Package packageThree = new Package(28, 'M');
        packageThree.display();

        InsuredPackage packageFour = new InsuredPackage(7, 'A');
        packageFour.display();
        InsuredPackage packageFive = new InsuredPackage(14, 'T');
        packageFive.display();
        InsuredPackage packageSix = new InsuredPackage(32, 'M');
        packageSix.display();
    }
}
