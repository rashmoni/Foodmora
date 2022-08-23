package UserMenu;

import java.io.IOException;
import java.util.List;

import Default.User;
import DieticianMenu.DieticianMenu;
import GenerateWeek.GenerateWeek;
import ListRecipes.*;
import ViewRecipe.*;
import ListWeeks.*;

public class UserMenuModel {
    private final List<String> userMenuOptions = List.of("List my weeks", "List recipes", "View recepie", "Generate a new week");
    public List<String> getMenuOptions() {
        return userMenuOptions;
    }

    public void handleOption(int selectedOption) throws IndexOutOfBoundsException, IOException {
        User user = new User();
        switch (selectedOption) {
            case 0 -> new DieticianMenu();
            case 1 -> new ListWeeks();
            case 2 -> new ListRecipes("User");
            case 3 -> user.viewRecipe("user");
            //case 3 -> new ViewRecipe("User");
            case 4 -> new GenerateWeek();
            default -> throw new IndexOutOfBoundsException();
        }
    }
}
