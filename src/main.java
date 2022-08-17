import mainMenu.SelectUser;
import utils.Recipe;
import utils.RecipeReader;
import utils.fileWriter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

       /* List<String> ingredients = new ArrayList<>();
        ingredients.add("Peas,kg,0.2");
        ingredients.add("Water,l,1");
        ingredients.add("soup,kg,0.1");

        List<String> steps = new ArrayList<>();
        steps.add("Boil Water in a pan");
        steps.add("Put peas and salt");
        steps.add("Mix and stir well");

        Recipe rc1 = new Recipe(1, "peas soup",ingredients,steps);

        fileWriter writer = new fileWriter();
        writer.writeToFile(rc1);*/
        new RecipeReader();
        new SelectUser();
    }
}
