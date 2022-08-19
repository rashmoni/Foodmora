package CreateRecipe;

import Data.Recipe;

import java.io.IOException;

public class CreateRecipe {
    private Recipe recipe;
    CreateRecipePrintHandler handler;
    public CreateRecipe() throws IOException {
        handler = new CreateRecipePrintHandler();
        handler.getRecipeInput();
    }
}

