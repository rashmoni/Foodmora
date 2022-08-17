package mainMenu;

import dieticianMenu.DieticianMenu;
import userMenu.*;
import utils.Recipe;
import utils.RecipeReader;

import java.io.FileNotFoundException;
import java.util.List;

public class SelectUserModel {
    private final List<String> menuOptions = List.of("User", "Dietician");
    private List<Recipe> recipes;

    public SelectUserModel() throws FileNotFoundException {
        this.recipes= RecipeReader.getRecipes();
    }

    public List<String> getMenuOptions() {
        return menuOptions;
    }

    public void handleOption(int selectedOption) throws IndexOutOfBoundsException, FileNotFoundException {
        switch (selectedOption) {
            case 1 -> new UserMenu(recipes);
            case 2 -> new DieticianMenu();
            default -> throw new IndexOutOfBoundsException();
        }
    }
}
