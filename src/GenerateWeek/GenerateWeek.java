package GenerateWeek;

import java.io.IOException;
import java.util.*;
import Data.AllWeeks;
import Data.RecipePool;
import Data.Week;
import Default.User;
import UserMenu.UserMenu;
import utils.*;

public class GenerateWeek {
    RecipePool pool = new RecipePool();
    AllWeeks weeks = new AllWeeks();
    UserInput input = new UserInput();

     public GenerateWeek() throws IOException {
         GenerateNewWeek();
         new UserMenu();
    }

    public void GenerateNewWeek() throws IOException {
        List<String> allRecNames = pool.getAllRecipeNames();
        String WeekNumber = String.valueOf(weeks.getLastWeekNumber()+1);
        List<String> WeekValue = new ArrayList<>();
        List<String> randomList = GenerateRandomList.getRandomElement(allRecNames, 7);

        WeekValue.add(WeekNumber);
        WeekValue.addAll(randomList);
        Week week1 = new Week(WeekValue, weeks.getLastWeekNumber()+1);
        WeeKFileWriter.writeToFile(week1);
        System.out.print("New week "+WeekNumber+" is created ");
        input.pressEnterContinue();
    }
}