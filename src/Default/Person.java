package Default;

import ViewRecipe.*;

import java.io.FileNotFoundException;

public abstract class Person {
    public void viewRecipe() throws FileNotFoundException {
        new ViewRecipe("Person");
    }
    public void ListRecipe() {

    }
}
