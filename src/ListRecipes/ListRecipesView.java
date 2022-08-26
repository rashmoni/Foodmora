package ListRecipes;

import utils.PrintHandler;

import java.util.List;

public class ListRecipesView {
    public ListRecipesView(List<String> menuOptions)  {
        PrintHandler.clearScreen();
        PrintHandler.appTitle();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("List of all recipes: ");
            PrintHandler.pintList(menuOptions);
        }

    }
}
