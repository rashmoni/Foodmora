package ListWeeks;

import Data.AllWeeks;
import UserMenu.UserMenu;
import utils.PrintHandler;
import Data.Week;
import utils.UserInput;

import java.io.FileNotFoundException;
import java.util.List;

public class ListWeekModel {
    UserInput input = new UserInput();
    private final List<String> userMenuOptions;
    private final AllWeeks  weeks ;

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
        Week week = weeks.getWeek(weekValue);
        PrintHandler.printWeek(week);
        input.pressEnterContinue();
        new UserMenu();
    }
}
