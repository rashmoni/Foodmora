package utils;

import Data.Recipe;
import Data.Week;

import java.io.IOException;
import java.util.List;

public class PrintHandler {
    public static void appTitle() {
        System.out.println("=== Recipe Manager ==="+"\n");
    }
    public static void switchToUser() {
        System.out.println("[0] Switch to User");
    }
    public static void switchToDietician() {
        System.out.println("[0] Switch to Dietician");
    }

    public static void goBack() {
        System.out.println("[0] Go Back");
    }

    public static void previousMenu() {
        System.out.print("Enter 0 to go back to previous menu: ");
    }
    public static void clearScreen() {
        String OperatingSystem = System.getProperty("os.name");

        if (OperatingSystem.equals("Windows")) {
            clearScreenWindows();
        }
        else {
            clearScreenUnix();
        }
    }


    public static void printOptionList(List<String> options) {
        for (int index = 0; index < options.size(); index++) {
            int number = index + 1;
            String label = options.get(index);

            System.out.println("[" + number + "] " + label);
        }
    }

    public static void pintList(List<String> options) {
        for (int index = 0; index < options.size(); index++) {
            int number = index + 1;
            String label = options.get(index);

            System.out.println( number+ ". " + label);
        }
    }

    public static void printRecipe(Recipe recipe) {

        List<String> ingredients = recipe.getIngredients();
        List<String> steps = recipe.getSteps();

        System.out.println(recipe.getName());
        System.out.println("Ingredients: ");
        for (int index = 0; index < ingredients.size(); index++) {
            if(index>=2) {
                System.out.println("\t"+ingredients.get(index));
            }
        }

        System.out.println("\n"+"Steps: ");
        for (int index = 0; index < steps.size(); index++) {
            if (index >=2) {
                System.out.println("\t"+steps.get(index));
            }
        }
    }

    public static void printWeek(Week week) {

        List<String> weekValues = week.getWeek();
        String weekNumber = weekValues.get(0);

        System.out.println("Items for Week " +weekNumber+ " : ");
        System.out.println("1. Monday    " + "\t"+weekValues.get(1));
        System.out.println("2. Tuesday   " + "\t"+weekValues.get(2));
        System.out.println("3. Wednesday " + "\t"+weekValues.get(3));
        System.out.println("4. Thursday  " + "\t"+weekValues.get(4));
        System.out.println("5. Friday    " + "\t"+weekValues.get(5));
        System.out.println("6. Saturday  " + "\t"+weekValues.get(6));
        System.out.println("7. Sunday    " + "\t"+weekValues.get(7));
    }

    private static void clearScreenUnix() {
        String clearScreenASCIICode = "\033[H\033[2J";

        System.out.print(clearScreenASCIICode);
        System.out.flush();
    }

    private static void clearScreenWindows() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException error) {
            System.out.println("A minor problem happened with the app. It will work but may not display correctly");
        }
    }
}