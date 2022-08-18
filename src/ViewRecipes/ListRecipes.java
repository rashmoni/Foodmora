package ViewRecipes;

import java.io.FileNotFoundException;


public class ListRecipes {

    public ListRecipes(String typeofUser) throws FileNotFoundException {
        ListRecipesModel model = new ListRecipesModel();
        ListRecipesView view = new ListRecipesView(model.getMenuOptions());
        ListRecipesController controller = new ListRecipesController(model, view, typeofUser);

        controller.requestUserInput();

    }


}
