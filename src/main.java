import UserSelection.SelectUser;
import utils.RecipeFileReader;
import utils.WeekFileReader;

import java.io.*;

public class main {

    public static void main(String[] args)  {

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
try {
    new RecipeFileReader();
    new WeekFileReader();
    new SelectUser();
}catch (FileNotFoundException exception){
    System.out.println("❌ Can't start the app because the file inside the asset folder is missing");
}


    }
}
