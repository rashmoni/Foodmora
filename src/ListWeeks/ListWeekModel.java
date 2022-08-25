package ListWeeks;

import Data.AllWeeks;
import UserMenu.UserMenu;
import utils.PrintHandler;
import Data.Week;
import utils.UserInput;
import utils.WeekFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListWeekModel {
    UserInput input = new UserInput();
    private List<String> userMenuOptions;
    private AllWeeks weeks ;
    private Week week;

    public ListWeekModel() throws FileNotFoundException {
        this.weeks = new AllWeeks();
        userMenuOptions = weeks.getAllWeekNames();
    }

    public List<String> getMenuOptions() {
        return userMenuOptions;
    }

    public void handleOption(int selectedOption) throws IndexOutOfBoundsException, FileNotFoundException {
        int size = weeks.getTotalWeekCount();

        if(selectedOption==0){
            new UserMenu();
        }
        else if (selectedOption<=size) {
            handleWeek(selectedOption-1);
        }
        else throw new IndexOutOfBoundsException();
    }

    private void handleWeek(int weekValue) throws FileNotFoundException {
        week = weeks.getWeek(weekValue);
        PrintHandler.printWeek(week);
        input.pressEnterContinue();
        new UserMenu();
    }
}
