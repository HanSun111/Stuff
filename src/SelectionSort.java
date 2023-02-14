import java.util.ArrayList;
import java.util.Arrays;
public class SelectionSort {
    private ArrayList<Dates> dates;

    public SelectionSort(){
        dates = new ArrayList<>();
    }

    public void addDates(Dates newD){
        dates.add(newD);
    }

    public ArrayList<Dates> getDates() {
        return dates;
    }

    public Dates findSmallest(){
        Dates smallest = dates.get(0);
        for(Dates d : dates){
            if(d.getDay() < smallest.getDay() && d.getMonth() < smallest.getMonth() && d.getYears() < smallest.getYears()){
                smallest = d;
            }
        }
        return smallest;
    }

    public void sort(){
        
    }
}
