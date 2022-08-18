package UserSelection;

import DieticianMenu.DieticianMenu;
import UserMenu.*;

import java.io.FileNotFoundException;
import java.util.List;

public class SelectUserModel {
    private final List<String> menuOptions = List.of("User", "Dietician");

    public SelectUserModel() throws FileNotFoundException {
        //this.recipes= RecipeFileReader.getRecipes();
    }

    public List<String> getMenuOptions() {
        return menuOptions;
    }

    public void handleOption(int selectedOption) throws IndexOutOfBoundsException, FileNotFoundException {
        switch (selectedOption) {
            case 1 -> new UserMenu();
            case 2 -> new DieticianMenu();
            default -> throw new IndexOutOfBoundsException();
        }
    }
}
