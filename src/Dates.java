import java.util.ArrayList;
import java.util.Arrays;
public class Dates {
    private int day;
    private int month;
    private int years;
    private ArrayList<Integer> aDate;
    public Dates(int d, int m, int y){
        aDate = new ArrayList<>();
        aDate.add(m);
        aDate.add(d);
        aDate.add(y);
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYears() {
        return years;
    }

    public ArrayList<Integer> getaDate() {
        return aDate;
    }
}
