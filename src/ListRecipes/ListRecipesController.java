package ListRecipes;

import DieticianMenu.DieticianMenu;
import UserMenu.UserMenu;
import utils.UserInput;

import java.io.FileNotFoundException;

public class ListRecipesController {
    private final ListRecipesView view;
    private final ListRecipesModel model;
    private final String typeOfUser;
    UserInput input = new UserInput();

    public ListRecipesController(ListRecipesModel model, ListRecipesView view, String typeOfUser) {
        this.model = model;
        this.view = view;
        this.typeOfUser = typeOfUser;
    }

    public void requestUserInput() throws FileNotFoundException {
        input.pressEnterContinue();
        if(typeOfUser.equalsIgnoreCase("user"))
        new UserMenu();
        else new DieticianMenu();
    }
}
