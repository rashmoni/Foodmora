package EditRecipe;

import Data.RecipePool;
import utils.PrintHandler;
import utils.UserInput;
import java.io.*;
import java.util.List;

public class EditRecipeHandler {

    UserInput input = new UserInput();
    public EditRecipeHandler() throws FileNotFoundException {
        RecipePool pool = new RecipePool();
        List<String> allRecNames = pool.getAllRecipeNames();
        int allRecipeCount = allRecNames.size();
        List<String> editMenuOptions = List.of("Add steps ","Delete steps","Add ingredients","Delete ingredients");
        int allEditCount = editMenuOptions.size();
        int userSelection;
        int selectedEditOption;


        PrintHandler.printOptionList(allRecNames);
        userSelection = input.readInteger("Select recipe: ", "Invalid option: ",1,allRecipeCount);
        PrintHandler.printOptionList(editMenuOptions);
        selectedEditOption = input.readInteger("Select an option: ", "Invalid option: ",1,allEditCount);
        switch (selectedEditOption){
            case 1: EditSteps.add(userSelection, pool);
            case 2: EditSteps.delete(userSelection, pool);
            case 3: EditIngredients.add(userSelection, pool);
            case 4: EditIngredients.delete();
        }

    }



}