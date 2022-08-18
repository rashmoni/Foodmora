package ViewRecipe;

import utils.Recipe;
import utils.RecipeFileReader;

import java.io.FileNotFoundException;
import java.util.List;

public class ViewRecipeModel {
    private static List<Recipe> recipes;
    private  Recipe recipe;

    public ViewRecipeModel() {
        this.recipes = RecipeFileReader.getRecipes();
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void handleOption(int selectedOption) throws IndexOutOfBoundsException, FileNotFoundException {

        if (selectedOption>0)
                recipe = recipes.get(selectedOption-1);
        else
            throw new IndexOutOfBoundsException();
        }
    }

