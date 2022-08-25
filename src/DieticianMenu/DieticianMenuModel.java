package DieticianMenu;

import CreateRecipe.CreateRecipe;
import Default.Dietician;
import EditRecipe.EditRecipeHandler;
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
        Dietician dietician = new Dietician();
        switch (selectedOption) {
            case 0 -> new UserMenu();
            case 1 -> new CreateRecipe();
            case 2 -> new EditRecipeHandler();
            case 3 -> dietician.listRecipe("dietician");
            //case 3 -> new ListRecipes("dietician");
           // case 4 -> new ViewRecipe("dietician");
            case 4 -> dietician.viewRecipe("dietician");
            default -> throw new IndexOutOfBoundsException();
        }
    }
}
