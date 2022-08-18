package ViewRecipe;

import utils.PrintHandler;
import utils.Recipe;

import java.util.List;

public class ViewRecipeView {
    public ViewRecipeView() {
        PrintHandler.clearScreen();
        printRequest();
    }

    public void printInvalidOption() {
        System.out.println("⚠️ Recipe not found, please enter correct recepie id: ");
    }

    public void printRequest() {
        System.out.print("Enter valid recipe ID: ");
    }

    public void exitMenuView() {
        System.out.print("press enter to continue ...");
    }

    public void printSongNotFoundError() {
        System.out.println("❌️ Cannot play this song");
    }

    public void printRec(Recipe recipe) {
        PrintHandler.printRecipe(recipe);
    }


}
