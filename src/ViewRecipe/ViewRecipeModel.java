package ViewRecipe;

import Data.Recipe;
import Data.RecipePool;
import java.io.FileNotFoundException;

public class ViewRecipeModel {
    private  Recipe recipe;
    RecipePool pool;
    public ViewRecipeModel() throws FileNotFoundException {
        this.pool = new RecipePool();
    }

    public int allRecipes() throws FileNotFoundException {
        return pool.getTotalRecipeCount();
    }

public Recipe getRecipe(){
        return recipe;
}
    public void handleOption(int selectedOption) throws IndexOutOfBoundsException, FileNotFoundException {

        if (selectedOption>0)
                recipe = pool.getRecipeByID(selectedOption-1);
        else
            throw new IndexOutOfBoundsException();
        }
    }

