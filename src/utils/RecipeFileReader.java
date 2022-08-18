package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class RecipeFileReader {
    private static Scanner scanner1;
    private static Scanner scanner2;
    private static List<Recipe> recipes;

    public RecipeFileReader() throws FileNotFoundException {
        File ingFile = new File("assets/ingredients.txt");
        File stepsFile = new File("assets/steps.txt");
        scanner1 = new Scanner(ingFile);
        scanner2 = new Scanner(stepsFile);
        recipes = generateRecipes();
    }
    public static List<Recipe> getRecipes() {
        return recipes;
    }
    public List<Recipe> generateRecipes() throws FileNotFoundException {
        List<Recipe> recipes = new ArrayList<>();
        while (scanner1.hasNextLine()) {
            String rawData1 = scanner1.nextLine();
            String rawData2 = scanner2.nextLine();
            List<String> ingData = List.of(rawData1.split(","));
            List<String> stepsData = List.of(rawData2.split(","));
            int ID = Integer.parseInt(ingData.get(0));
            String name = ingData.get(1);
            Recipe newRecipe = new Recipe(ID, name,ingData,stepsData);

            recipes.add(newRecipe);
        }

        return recipes;
    }
}
