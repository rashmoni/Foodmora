package ListRecipes;

import userMenu.UserMenuController;
import userMenu.UserMenuModel;
import userMenu.UserMenuView;
import utils.PrintHandler;
import utils.Recipe;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;


public class ListRecipes {

    public ListRecipes(List<Recipe> recipes) throws FileNotFoundException {
        ListRecipesModel model = new ListRecipesModel(recipes);
        ListRecipesView view = new ListRecipesView(model.getMenuOptions());
        ListRecipesController controller = new ListRecipesController(model, view);

        controller.requestUserInput();

    }




}
