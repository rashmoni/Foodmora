package userMenu;

import utils.Recipe;

import java.io.FileNotFoundException;
import java.util.List;

public class UserMenu {
    public UserMenu(List<Recipe> recipes) throws FileNotFoundException {
        UserMenuModel model = new UserMenuModel(recipes);
        UserMenuView view = new UserMenuView(model.getMenuOptions());
        UserMenuController controller = new UserMenuController(model, view);

        controller.requestUserInput();
    }
}
