package Data;

import java.util.List;

public class Week implements java.io.Serializable{
    private final List<String> weekValues;
    private final int weekNumber;
    public Week (List<String> weekValues, int weekNumber){
        this.weekValues = weekValues;
        this.weekNumber= weekNumber;
    }
    public List<String> getWeek(){
        return weekValues;
    }

    public int getWeekNumber(){
        return weekNumber;
    }

}
