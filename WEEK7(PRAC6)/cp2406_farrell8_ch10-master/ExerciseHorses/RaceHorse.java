/*create a subclass named RaceHorse, which contains an additional field that holds the number of races in which
the horse has competed and additional methods to get and set the new field. */

public class RaceHorse extends Horse{
    private String name;
    private String color;
    private int birthYear;
    private int races;

    public void setRaces(int races) {
        this.races = races;
    }

    public int getRaces() {
        return races;
    }
}

