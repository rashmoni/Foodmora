package utils;

import java.io.FileNotFoundException;
import java.util.List;

public class ViewRecipe {

    public ViewRecipe(List<Recipe> recipes) throws FileNotFoundException {
        printRecipe(recipes);
        System.out.println("Print Recipes");

    }
    public static void printRecipe(List<Recipe> recipes){
        System.out.println("View Recipes");
    }
}
