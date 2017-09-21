public class UseDivision
{
    public static void main(String []args)
    {
        InternationalDivision id1 = new InternationalDivision("EB Games",1000, "Americia", "English");
        InternationalDivision id2 = new InternationalDivision("Miss Sushi",2000, "China", "Chinese");
        DomesticDivision dd1 = new DomesticDivision("Cats and Dogs", 1100, "Queensland");
        DomesticDivision dd2 = new DomesticDivision("Birds and Fish", 1200, "New South Wales");
        id1.display();
        id2.display();
        dd1.display();
        dd2.display();
    }
}