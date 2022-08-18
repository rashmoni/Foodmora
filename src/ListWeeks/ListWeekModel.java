package ListWeeks;

import DieticianMenu.DieticianMenu;
import UserMenu.UserMenu;
import utils.PrintHandler;
import utils.Recipe;
import utils.Week;
import utils.WeekFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListWeekModel {
    private final List<String> userMenuOptions;
    private static List<Week> weeks;

    private Week week;


    public ListWeekModel() throws FileNotFoundException {
        new WeekFileReader();
        this.weeks = WeekFileReader.getWeeks();
        this.userMenuOptions = allWeeks(weeks);
    }

    public List<String> getMenuOptions() {
        return userMenuOptions;
    }

    public Week getWeek() {
        return week;
    }

    private List<String> allWeeks(List<Week> weeks) {
        List<String> allWeekValue = new ArrayList<>();
        for (int index = 0; index < weeks.size(); index++) {
            String weekVal = "Week " + weeks.get(index).getWeek().get(0);
            allWeekValue.add(weekVal);
        }
        return allWeekValue;
    }

    public void handleOption(int selectedOption) throws IndexOutOfBoundsException, FileNotFoundException {
        switch (selectedOption) {
            case 0 -> new UserMenu();
            case 1 -> handleWeek(selectedOption-1);
            default -> throw new IndexOutOfBoundsException();
        }
    }

    private void handleWeek(int weekValue) throws FileNotFoundException {
        week = weeks.get(weekValue);
        PrintHandler.printWeek(week);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Press Enter to continue ....");
        scanner.nextLine();
        new UserMenu();
    }
}
