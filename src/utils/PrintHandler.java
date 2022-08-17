package utils;

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


    public static void optionList(List<String> options) {
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

    public static void printRecipe(List<String> recipe) {
        for (int index = 0; index < recipe.size(); index++) {
            int number = index + 1;
            String label = recipe.get(index);

            System.out.println("[" + number + "] " + label);
        }
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