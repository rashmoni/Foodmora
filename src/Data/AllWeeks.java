package Data;

import utils.WeekFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class AllWeeks {
    private final int totalWeekCount;
    private static List<Week> weeks;

    public AllWeeks() throws FileNotFoundException {
        WeekFileReader reader = new WeekFileReader();
        this.weeks = reader.getWeeks();
        this.totalWeekCount= weeks.size();
    }


    public Week getWeek(int weekIndex){
        return weeks.get(weekIndex);
    }

    public int getTotalWeekCount(){
        return totalWeekCount;
    }

    public int getLastWeekNumber(){
        int lastWeekNumber = (weeks.get(weeks.size()-1).getWeekNumber());
        if (lastWeekNumber<52) return lastWeekNumber;
        else return 0;
    }

    public List<String> getAllWeekNames() {
        List<String> allWeekValues = new ArrayList<>();
        for (Week week : weeks) {
            String weekVal = "Week " + week.getWeek().get(0);
            allWeekValues.add(weekVal);
        }
        return allWeekValues;
    }

}
