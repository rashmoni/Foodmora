package ViewRecipe;

import java.io.FileNotFoundException;


public class ViewRecipe {

    public ViewRecipe(String typeOfUser) throws FileNotFoundException {
        ViewRecipeModel model = new ViewRecipeModel();
        ViewRecipeView view = new ViewRecipeView(model.allRecipes());
        ViewRecipeController controller = new ViewRecipeController(model, view, typeOfUser);

        controller.requestUserInput();

    }


}
