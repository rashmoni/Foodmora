package UserMenu;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import DieticianMenu.DieticianMenu;
import utils.*;
import ListRecipes.*;
import ViewRecipe.*;
import ListWeeks.*;

public class UserMenuModel {
    private final List<String> userMenuOptions = List.of("List my weeks", "List recipes", "View recepie", "Generate a new week");
    public List<String> getMenuOptions() {
        return userMenuOptions;
    }

    public void handleOption(int selectedOption) throws IndexOutOfBoundsException, IOException {
        switch (selectedOption) {
            case 0 -> new DieticianMenu();
            case 1 ->  new ListWeeks();
            case 2 -> new ListRecipes("User");
            case 3 -> new ViewRecipe("User");
            case 4 -> new GenerateWeek();
            default -> throw new IndexOutOfBoundsException();
        }
    }
}
