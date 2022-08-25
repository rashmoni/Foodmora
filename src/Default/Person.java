package Default;

import ListRecipes.ListRecipes;
import ViewRecipe.*;

import java.io.FileNotFoundException;

public abstract class Person {
    public void viewRecipe(String user) throws FileNotFoundException {
        new ViewRecipe(user);
    }
    public void listRecipe(String user) throws FileNotFoundException {
        new ListRecipes(user);
    }
}
