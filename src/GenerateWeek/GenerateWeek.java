package GenerateWeek;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import Data.RecipePool;
import Data.Week;
import UserMenu.*;
import utils.*;

public class GenerateWeek {
    RecipePool pool = new RecipePool();
    private final Scanner scanner;

     public GenerateWeek() throws IOException {
        this.scanner = new Scanner(System.in);
         GenerateNewWeek();
    }

    public void GenerateNewWeek() throws IOException {
        List<String> allRecNames = getAllRecipeNames();
        String WeekNumber = String.valueOf(getLatWeekNumber()+1);
        List<String> WeekValue = new ArrayList<>();
        List<String> randomList = getRandomElement(allRecNames, 7);

        WeekValue.add(WeekNumber);
        WeekValue.addAll(randomList);

        Week week1 = new Week(WeekValue);
        WeeKFileWriter.writeToFile(week1);
        System.out.print("New week "+WeekNumber+" is created, press enter to continue...");
        requestUserInput();
    }

    private List<String> getAllRecipeNames() throws FileNotFoundException {
        return pool.getAllRecipeNames();
    }

    private List<String> getAllWeeks() throws FileNotFoundException {
        WeekFileReader weeks = new WeekFileReader();
        List<Week> allWeeks = weeks.getWeeks();
        List<String> allWeekNames = new ArrayList<>();
        for (int index = 0; index < allWeeks.size(); index++) {
            String weekName = allWeeks.get(index).getWeek().get(0);
            allWeekNames.add(weekName);
        }
        return allWeekNames;
    }

    private int getLatWeekNumber() throws FileNotFoundException {
        List<String> allWeeks = getAllWeeks();
        int lastWeekNumber = Integer.parseInt(allWeeks.get(allWeeks.size()-1).substring(0,2));
        return lastWeekNumber;
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