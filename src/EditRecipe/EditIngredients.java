package EditRecipe;

import CreateRecipe.CreateRecipeHandler;
import Data.Recipe;
import Data.RecipePool;
import utils.EditRecordFiles;

import java.util.ArrayList;
import java.util.List;

public class EditIngredients {
    public static void add(int userSelection, RecipePool pool){
        Recipe oldRecipe = pool.getRecipeByID(userSelection-1);
        List<String> oldIngredient = oldRecipe.getIngredients();
        List<String> newIngredient = new ArrayList<>();
        CreateRecipeHandler handler = new CreateRecipeHandler();
        List<String> ingredient = handler.inputIngredients();
        String IngStr = String.join(",",ingredient);

        newIngredient.addAll(oldIngredient);
        newIngredient.add(IngStr);
        String newIngStr = String.join(",",newIngredient);
        String oldIngStr = String.join(",",oldIngredient);
        EditRecordFiles.edit("assets/ingredients.txt", oldIngStr, newIngStr);

    }

    public static void delete(){}
}
