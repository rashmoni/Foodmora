package userMenu;

import java.io.FileNotFoundException;
import java.util.List;

import ListRecipes.ListRecipes;
import utils.*;

public class UserMenuModel {
    private final List<String> userMenuOptions = List.of("List my weeks", "List recipes", "View recepie", "Generate a new week");
    private static List<Recipe> recipes;

    public UserMenuModel(List<Recipe> recipes) throws FileNotFoundException {
        this.recipes= recipes;
    }

    public List<String> getMenuOptions() {
        return userMenuOptions;
    }



    public void handleOption(int selectedOption) throws IndexOutOfBoundsException, FileNotFoundException {
        switch (selectedOption) {
            case 1 ->  new ListWeeks();
            case 2 -> new ListRecipes(recipes);
            case 3 -> new ViewRecipe(recipes);
            case 4 -> new GenerateWeek();
            default -> throw new IndexOutOfBoundsException();
        }
    }
}
