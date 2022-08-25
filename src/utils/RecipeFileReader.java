package utils;

import Data.Recipe;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class RecipeFileReader {
    private static Scanner scannerIng;
    private static Scanner scannerStep;
    private static List<Recipe> recipes;

    public RecipeFileReader() throws FileNotFoundException {
        File ingFile = new File("assets/ingredients.txt");
        File stepsFile = new File("assets/steps.txt");
        scannerIng = new Scanner(ingFile);
        scannerStep = new Scanner(stepsFile);
        recipes = generateRecipes();
    }
    public static List<Recipe> getRecipes() {
        return recipes;
    }
    public List<Recipe> generateRecipes()  {
        List<Recipe> recipes = new ArrayList<>();
        while (scannerIng.hasNextLine()) {
            String ingredient = scannerIng.nextLine();
            String step = scannerStep.nextLine();
            List<String> ingList = List.of(ingredient.split(","));
            List<String> stepsList = List.of(step.split(","));
            int ID = Integer.parseInt(ingList.get(0));
            String name = ingList.get(1);
            Recipe newRecipe = new Recipe(ID, name,ingList,stepsList);

            recipes.add(newRecipe);
        }

        return recipes;
    }
}
