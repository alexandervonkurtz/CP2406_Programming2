/*Create a class named Horse that contains data fields for the name, color, and birth
year. Include get and set methods for these fields.*/


public class Horse
{
    //contains data fields for the name, color, and birth year
    private String name;
    private String color;
    private int birthYear;

    //Include get and set methods for these fields
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return birthYear;
    }

}