package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WeekFileReader {
    private static Scanner scanner;
    private static List<Week> weeks;

    public WeekFileReader() throws FileNotFoundException {
        File userDataFile = new File("assets/userdata.txt");
        scanner = new Scanner(userDataFile);
        weeks = generateWeeks();
    }
    public static List<Week> getWeeks() {
        return weeks;
    }
    public List<Week> generateWeeks() throws FileNotFoundException {
        List<Week> weeks = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String singleWeekDataString = scanner.nextLine();
            List<String> singleWeekDataList = List.of(singleWeekDataString.split(","));
            Week week = new Week(singleWeekDataList);
            weeks.add(week);
        }

        return weeks;
    }
}
