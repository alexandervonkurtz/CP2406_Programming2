abstract class Division
{
    String name;
    int accNum;

    abstract void display();

    Division(String name, int accNum)
    {
        this.name = name;
        this.accNum = accNum;
    }
}