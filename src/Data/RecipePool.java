package Data;

import utils.RecipeFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class RecipePool {
    private static List<Recipe> recipes;

    public RecipePool() throws FileNotFoundException {
        this.recipes=getAllRecipes();
    }

    private List<Recipe> getAllRecipes() throws FileNotFoundException {
        RecipeFileReader reader = new RecipeFileReader();
        return reader.getRecipes();
    }

    public int getTotalRecipeCount() throws FileNotFoundException {
        return getAllRecipes().size();
    }

    public Recipe getRecipeByID(int ID){
        return recipes.get(ID);
    }

    public List<String> getAllRecipeNames(){
        List<String> allRecNames = new ArrayList<>();
        for (Recipe recipe : recipes) {
            String recName = recipe.getName();
            allRecNames.add(recName);
        }
        return allRecNames;
    }
}
