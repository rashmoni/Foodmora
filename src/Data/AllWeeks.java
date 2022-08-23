package Data;

import utils.WeekFileReader;

import java.io.FileNotFoundException;
import java.util.List;

public class AllWeeks {
    private int totalWeekCount;
    private static List<Week> weeks;

    public AllWeeks() throws FileNotFoundException {
        this.weeks=WeekFileReader.getWeeks();
        this.totalWeekCount= weeks.size();
    }

    public List<Week> getAllWeeks(){
        return weeks;
    }

    public int getTotalWeekCount(){
        return totalWeekCount;
    }

    public int getLastWeekNumber(){
        int lastWeekNumber = (weeks.get(weeks.size()-1).getWeekNumber());
        return lastWeekNumber;
    }

}
