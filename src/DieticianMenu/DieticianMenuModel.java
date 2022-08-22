package DieticianMenu;

import CreateRecipe.CreateRecipe;
import EditRecipe.EditRecipe;
import UserMenu.*;

import java.io.IOException;
import java.util.List;
import ListRecipes.*;
import ViewRecipe.*;

public class DieticianMenuModel {
    private final List<String> dieticianMenuOptions = List.of("Create new recipe", "Edit recepie","List recipes", "View recepie");

    public List<String> getMenuOptions() {
        return dieticianMenuOptions;
    }

    public void handleOption(int selectedOption) throws IndexOutOfBoundsException, IOException {
        switch (selectedOption) {
            case 0 -> new UserMenu();
            case 1 -> new CreateRecipe();
            case 2 -> new EditRecipe();
            case 3 -> new ListRecipes("dietician");
            case 4 -> new ViewRecipe("dietician");
            default -> throw new IndexOutOfBoundsException();
        }
    }
}
