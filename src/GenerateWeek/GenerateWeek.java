package GenerateWeek;

import java.io.IOException;
import java.util.*;
import Data.AllWeeks;
import Data.RecipePool;
import Data.Week;
import UserMenu.*;
import utils.*;

public class GenerateWeek {
    RecipePool pool = new RecipePool();
    AllWeeks weeks = new AllWeeks();
    private final Scanner scanner;

     public GenerateWeek() throws IOException {
        this.scanner = new Scanner(System.in);
        GenerateNewWeek();
    }

    public void GenerateNewWeek() throws IOException {
        List<String> allRecNames = pool.getAllRecipeNames();
        String WeekNumber = String.valueOf(weeks.getLastWeekNumber()+1);
        List<String> WeekValue = new ArrayList<>();
        List<String> randomList = getRandomElement(allRecNames, 7);

        WeekValue.add(WeekNumber);
        WeekValue.addAll(randomList);
        Week week1 = new Week(WeekValue, weeks.getLastWeekNumber()+1);
        System.out.println(week1);
        WeeKFileWriter.writeToFile(week1);
        System.out.print("New week "+WeekNumber+" is created, press enter to continue...");
        requestUserInput();
    }

    public void requestUserInput() throws IOException {
        String input = scanner.nextLine();
            new UserMenu();
    }

    public static List<String> getRandomElement(List<String> list, int totalItems)
    {
        Random rand = new Random();

        List<String> userList = list;
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < totalItems; i++) {
            int randomIndex = rand.nextInt(userList.size());
            newList.add(userList.get(randomIndex));
            userList.remove(randomIndex);
        }
        return newList;
    }


}