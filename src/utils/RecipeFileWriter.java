package utils;

import java.io.*;
import java.util.List;

public class RecipeFileWriter {
    public static void writeToFile(Recipe rec1) throws IOException {
        File ingFile = new File("assets/recipe/ingredients.txt");
        File stepsFile = new File("assets/recipe/steps.txt");
        List ingredients = rec1.getIngredients();
        List steps = rec1.getSteps();
        String delim = ",";
        String ingStr = String.join(delim,ingredients);
        String stepsStr = String.join(delim,steps);

        java.io.FileWriter ingWriter = new java.io.FileWriter(ingFile, true);
        PrintWriter ingOut = new PrintWriter(ingWriter);
        ingOut.print(rec1.getID()+ ","+rec1.getName()+","+ingStr+"\n");
        ingOut.close();

        java.io.FileWriter stepsWriter = new java.io.FileWriter(stepsFile, true);
        PrintWriter stepsOut = new PrintWriter(stepsWriter);
        stepsOut.print(rec1.getID()+ ","+rec1.getName()+","+stepsStr+"\n");
        stepsOut.close();

    }
}