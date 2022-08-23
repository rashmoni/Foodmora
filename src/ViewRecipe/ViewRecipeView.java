package ViewRecipe;

import utils.PrintHandler;
import Data.Recipe;

public class ViewRecipeView {
    int totalRecipe;
    public ViewRecipeView(int totalRecipe ) {
        PrintHandler.clearScreen();
        this.totalRecipe= totalRecipe;
        printUserPrompt();
    }

    public void printInvalidOption() {
        System.out.println("⚠️ please enter correct recepie id: ");
    }

    public void printUserPrompt() {
        System.out.print("Enter recipe ID between 1 and "+totalRecipe + " : ");
    }

    public void exitMenuView() {
        System.out.print("press enter to continue ...");
    }

    public void printRec(Recipe recipe) {
        PrintHandler.printRecipe(recipe);
    }


}
