package Data;

import utils.RecipeFileReader;

import java.io.FileNotFoundException;
import java.util.List;

public class RecipePool {
    public static List<Recipe> getRecipes() {
        return recipes;
    }

    private int totalRecipeCount;
    private static List<Recipe> recipes;

    public RecipePool() throws FileNotFoundException {
        this.recipes=getAllRecipes();
        this.totalRecipeCount=getTotalRecipeCount();
    }

    private List<Recipe> getAllRecipes() throws FileNotFoundException {
        RecipeFileReader reader = new RecipeFileReader();
        return reader.getRecipes();
    }

    public int getTotalRecipeCount() throws FileNotFoundException {
        return getAllRecipes().size();
    }

    public Recipe getRecipe(int ID){
        Recipe recipe = recipes.get(ID);
        return recipe;
    }
}
