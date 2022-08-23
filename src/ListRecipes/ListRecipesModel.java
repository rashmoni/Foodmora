package ListRecipes;


import Data.RecipePool;
import java.io.FileNotFoundException;
import java.util.List;

public class ListRecipesModel {
    RecipePool pool;
    public ListRecipesModel() throws FileNotFoundException {
         this.pool = new RecipePool();
    }

    public List<String> getMenuOptions() {
        return pool.getAllRecipeNames();
    }

}
