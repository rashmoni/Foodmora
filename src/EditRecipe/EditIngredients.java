package EditRecipe;

import CreateRecipe.CreateRecipeHandler;
import Data.Recipe;
import Data.RecipePool;
import utils.EditRecordFiles;
import utils.PrintHandler;
import utils.UserInput;

import java.util.ArrayList;
import java.util.List;

public class EditIngredients {
    static UserInput input = new UserInput();
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

    public static void delete(int userSelection, RecipePool pool){
        Recipe oldRecipe = pool.getRecipeByID(userSelection-1);
        List<String> oldIngredient = oldRecipe.getIngredients();
        List<String> optionList = new ArrayList<>();
        List<String> newIngredient = new ArrayList<>();

        for (int index=2; index<oldIngredient.size();index++ ){
            optionList.add(oldIngredient.get(index));
        }

        newIngredient.addAll(oldIngredient);
        PrintHandler.printOptionList(optionList);
        int selectedIngredient = input.readInteger("Select the ingredient you want to delete: ", "Select valid ingredient",1,optionList.size());
        newIngredient.remove(selectedIngredient+1);
        String oldIngredientStr = String.join(",",oldIngredient);
        String newIngredientStr = String.join(",",newIngredient);

        EditRecordFiles.edit("assets/ingredients.txt",oldIngredientStr , newIngredientStr);

    }
}
