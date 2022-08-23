package CreateRecipe;

import Data.Recipe;

import java.io.IOException;

public class CreateRecipe {
    private Recipe recipe;
    CreateRecipeHandler handler;
    public CreateRecipe() throws IOException {
        handler = new CreateRecipeHandler();
        handler.generateNewRecipe();
    }
}

