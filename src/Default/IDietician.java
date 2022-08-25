package Default;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface IDietician {
    void createRecipe() throws IOException;
    void editRecipe() throws FileNotFoundException;
}
