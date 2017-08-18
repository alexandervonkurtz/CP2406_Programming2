import java.util.Date;

// holds fitness default values
public class FitnessTracker {
    private int minutes;
    private Date date;


    public FitnessTracker(int minutes1, Date date1) {
        minutes = minutes1;
        date = date1;
    }

    public String running(){

        //date = 2011-01-18 00:00:00.0;
        System.out.println("Minutes are: " + minutes + " Date is: " + date);

        return null;
    }
}
