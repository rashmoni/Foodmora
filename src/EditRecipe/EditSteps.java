package EditRecipe;

import Data.Recipe;
import Data.RecipePool;
import utils.EditUserDataFile;
import utils.FilePathReader;
import utils.PrintHandler;
import utils.UserInput;
import java.util.ArrayList;
import java.util.List;

public class EditSteps {
    static UserInput input = new UserInput();
    private static String StepFilePath = FilePathReader.stepPath;
    public static void add(int userSelection, RecipePool pool){
        Recipe oldRecipe = pool.getRecipeByID(userSelection-1);
        List<String> oldSteps = oldRecipe.getSteps();
        List<String> newSteps = new ArrayList<>();

        newSteps.addAll(oldSteps);
        String newStep = input.readText("Please enter the step you want to add: ");
        newSteps.add(newStep);
        String oldStepsStr = String.join(",",oldSteps);
        String newStepsStr = String.join(",",newSteps);
        EditUserDataFile.edit(StepFilePath, oldStepsStr, newStepsStr);

    }

    public static void delete(int userSelection, RecipePool pool){
        Recipe oldRecipe = pool.getRecipeByID(userSelection-1);
        List<String> oldSteps = oldRecipe.getSteps();
        List<String> optionList = new ArrayList<>();
        List<String> newSteps = new ArrayList<>();

        for (int index=2; index<oldSteps.size();index++ ){
            optionList.add(oldSteps.get(index));
        }

        newSteps.addAll(oldSteps);
        PrintHandler.printOptionList(optionList);
        int selectedStep = input.readInteger("Select the step you want to delete: ", "Select valid recipe",1,optionList.size());
        newSteps.remove(selectedStep+1);
        String oldStepsStr = String.join(",",oldSteps);
        String newStepsStr = String.join(",",newSteps);
        EditUserDataFile.edit(StepFilePath, oldStepsStr, newStepsStr);

    }
}
