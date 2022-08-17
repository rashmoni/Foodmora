package ListRecipes;

import userMenu.UserMenu;
import utils.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ListRecipesModel {
    private final List<String> userMenuOptions;
    private static List<Recipe> recipes;

    public ListRecipesModel(List<Recipe> recipes) throws FileNotFoundException {
        this.recipes= recipes;
        this.userMenuOptions = allRecipes(recipes);
    }

    public List<String> getMenuOptions() {
        return userMenuOptions;
    }

    private List<String> allRecipes(List<Recipe> recipes){
        List<String> allRecipeName = new ArrayList<>();
        for (int index = 0; index< recipes.size(); index++){
            String resname = recipes.get(index).getName();
            allRecipeName.add(resname);
        }
        return allRecipeName;
    }

    public void handleOption(int selectedOption) throws IndexOutOfBoundsException, FileNotFoundException {
        switch (selectedOption) {
            case 0 ->  new UserMenu(recipes);
            default -> throw new IndexOutOfBoundsException();
        }
    }
}
