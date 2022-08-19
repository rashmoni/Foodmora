package Data;

import utils.RecipeFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;
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

    public Recipe getRecipeByID(int ID){
        Recipe recipe = recipes.get(ID);
        return recipe;
    }

    public List<String> getAllRecipeNames(){
        List<String> allRecNames = new ArrayList<>();
        for (int index = 0; index < recipes.size(); index++) {
            String recName = recipes.get(index).getName();
            allRecNames.add(recName);
        }
        return allRecNames;
    }
}
