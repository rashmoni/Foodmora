package DieticianMenu;

import utils.*;
import UserMenu.*;

import java.io.FileNotFoundException;
import java.util.List;
import ListRecipes.*;
import ViewRecipe.*;

public class DieticianMenuModel {
    private final List<String> dieticianMenuOptions = List.of("Create new recipe", "List recipes", "View recepie", "Edit/Update recepie");

    public List<String> getMenuOptions() {
        return dieticianMenuOptions;
    }

    public void handleOption(int selectedOption) throws IndexOutOfBoundsException, FileNotFoundException {
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
