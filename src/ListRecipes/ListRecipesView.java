package ListRecipes;

import utils.PrintHandler;

import java.util.List;

public class ListRecipesView {
    public ListRecipesView(List<String> menuOptions) {
        PrintHandler.clearScreen();
        PrintHandler.appTitle();
        System.out.println("List of all recipes: ");
        PrintHandler.pintList(menuOptions);
        exitMenuView();
    }

    public void printInvalidOption() {
        System.out.println("⚠️ Invalid option");
    }

    public void exitMenuView() {
        System.out.print("press enter to continue ...");
    }
}
