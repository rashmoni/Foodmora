package Data;

import java.util.List;

public class Week implements java.io.Serializable{
    private final List<String> week;

    public Week(List<String> week) {
        this.week = week;
    }

    public List<String> getWeek(){
        return this.week;
    }

}
