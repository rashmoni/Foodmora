package utils;

import Data.Recipe;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class RecipeFileWriter {
    public static void writeToFile(Recipe recipe) throws IOException {
        String ingFilePath = FilePathReader.IngPath;
        String stepsFilePath = FilePathReader.stepPath;
        File ingFile = new File(ingFilePath);
        File stepsFile = new File(stepsFilePath);
        List ingredients = recipe.getIngredients();
        List steps = recipe.getSteps();
        String Delim = ",";
        String ingStr = String.join(Delim,ingredients);
        String stepsStr = String.join(Delim,steps);

        outFileWriter(recipe, ingFile, ingStr);
        outFileWriter(recipe, stepsFile, stepsStr);
    }

    private static void outFileWriter(Recipe rec, File file, String outString) throws IOException {
        FileWriter writer = new FileWriter(file, true);
        PrintWriter out = new PrintWriter(writer);
        out.print("\n"+rec.getID()+ ","+rec.getName()+","+outString+"");
        out.flush();
        writer.flush();
        out.close();
        writer.close();

    }

}