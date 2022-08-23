package utils;

import Data.Recipe;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class RecipeFileWriter {
    public static void writeToFile(Recipe rec1) throws IOException {
        String ingFilePath = "assets/ingredients.txt";
        String stepsFilePath = "assets/steps.txt";
        File ingFile = new File(ingFilePath);
        File stepsFile = new File(stepsFilePath);
        List ingredients = rec1.getIngredients();
        List steps = rec1.getSteps();
        String Delim = ",";
        String ingStr = String.join(Delim,ingredients);
        String stepsStr = String.join(Delim,steps);

        outFileWriter(rec1, ingFile, ingStr);
        outFileWriter(rec1, stepsFile, stepsStr);
    }

    private static void outFileWriter(Recipe rec, File file, String outString) throws IOException {
        FileWriter stepsWriter = new FileWriter(file, true);
        PrintWriter stepsOut = new PrintWriter(stepsWriter);
        stepsOut.print("\n"+rec.getID()+ ","+rec.getName()+","+outString+"");
        stepsWriter.close();
        stepsOut.close();

    }

}