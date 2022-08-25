package CreateRecipe;

import Data.Recipe;
import Data.RecipePool;
import DieticianMenu.DieticianMenu;
import utils.RecipeFileWriter;
import utils.UserInput;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class CreateRecipe {
    UserInput input = new UserInput();
    RecipePool pool = new RecipePool();
    public CreateRecipe() throws IOException {
        generateNewRecipe();
    }

    public void generateNewRecipe() throws IOException {
        int totalRecipes = pool.getTotalRecipeCount();
        String recipeName;

        recipeName = input.readText("Please Enter Recipe Name: ");
        List<String> ingredients =  new Ingredients().getIngredients();
        List<String> steps = new Steps().getSteps();
        Recipe recipe = new Recipe(totalRecipes+1, recipeName, ingredients, steps);
        RecipeFileWriter writer = new RecipeFileWriter();
        writer.writeToFile(recipe);
        input.pressEnterContinue();
        new DieticianMenu();
    }
}

