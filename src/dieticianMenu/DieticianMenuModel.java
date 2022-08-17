package dieticianMenu;

import utils.*;

import java.util.List;

public class DieticianMenuModel {
    private final List<String> dieticianMenuOptions = List.of("Create new recipe", "List recipes", "View recepie", "Edit/Update recepie");

    public List<String> getMenuOptions() {
        return dieticianMenuOptions;
    }

    public void handleOption(int selectedOption) throws IndexOutOfBoundsException {
        switch (selectedOption) {
            case 1 ->  new CreateRecipe();
            case 2 -> new EditRecipe();
            case 3 ->  new ListWeeks();
            //case 4 -> new ListRecipes();
           // case 5 -> new ViewRecipes();
            case 6 -> new GenerateWeek();
            default -> throw new IndexOutOfBoundsException();
        }
    }
}
