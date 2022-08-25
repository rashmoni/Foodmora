package Default;

import CreateRecipe.*;
import EditRecipe.*;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Dietician extends Person implements IDietician {
    @Override
    public void createRecipe() throws IOException {
     new CreateRecipe();
    }

    @Override
    public void editRecipe() throws FileNotFoundException {
        new EditRecipe();
    }

}
