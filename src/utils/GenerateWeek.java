package utils;

import DieticianMenu.DieticianMenu;
import ListRecipes.ListRecipes;
import ListWeeks.ListWeeks;
import ViewRecipe.ViewRecipe;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import UserMenu.*;

public class GenerateWeek {

    private final Scanner scanner;

    public GenerateWeek() throws IOException {
        this.scanner = new Scanner(System.in);
        List<String> allRecNames = getAllRecipeNames();
        List<String> allWeekNames = getAllWeeks();
        int WeekNumber = 35;
        List<String> WeekValue = List.of("37", "rec1", "rec2", "rec3", "rec4", "rec5", "rec6", "rec7");

        Week week1 = new Week(WeekValue);
        WeeKFileWriter.writeToFile(week1);
        System.out.print("New week "+WeekNumber+" is created, press enter to continue...");
        requestUserInput();
    }

    private List<String> getAllRecipeNames() throws FileNotFoundException {
        RecipeFileReader recipes = new RecipeFileReader();
        List<Recipe> allRecipes = recipes.getRecipes();
        List<String> allRecNames = new ArrayList<>();
        for (int index = 0; index < allRecipes.size(); index++) {
            String recName = allRecipes.get(index).getName();
            allRecNames.add(recName);
        }
        return allRecNames;
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

    public void requestUserInput() throws IOException {
        String input = scanner.nextLine();
            new UserMenu();
    }

}