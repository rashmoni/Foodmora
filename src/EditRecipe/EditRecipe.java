package EditRecipe;

import Data.Recipe;
import Data.RecipePool;
import utils.PrintHandler;
import utils.UserInput;

import javax.management.StringValueExp;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EditRecipe {
    RecipePool pool;
    UserInput input = new UserInput();
    public EditRecipe() throws FileNotFoundException {
        pool = new RecipePool();

        List<String> allRecNames = pool.getAllRecipeNames();
        List<String> editMenuOptions = List.of("Add steps ","Delete steps","Add ingredients","Delete ingredients");

        PrintHandler.printOptionList(allRecNames);
        int userSelection = input.readInteger("Select recipe you want to edit: ", "Select valid recipe",0,allRecNames.size());
        PrintHandler.printOptionList(editMenuOptions);
        int editOption = input.readInteger("Select an option: ", "Invalid option",0,editMenuOptions.size());
        switch (editOption){
            case 1: addSteps(userSelection);
            case 2: deleteSteps();
            case 3: addIngredients();
            case 4: deleteIngredients();
        }


    }

    public void addSteps(int userSelection){
        Recipe oldRecipe = pool.getRecipeByID(userSelection-1);
        List<String> oldSteps = oldRecipe.getSteps();
        List<String> newSteps = new ArrayList<>();

        newSteps.addAll(oldSteps);

        String newStep = input.readText("Please enter the step: ");
        newSteps.add(newStep);
        String oldStepsStr = String.join(",",oldSteps);
        String newStepsStr = String.join(",",newSteps);

        editRecord("assets/steps.txt", oldStepsStr, newStepsStr);

    };
    public void deleteSteps(){};
    public void addIngredients(){};
    public void deleteIngredients(){};


    public static void editRecord(String filepath, String oldStepsStr, String newStepsStr) {

        String tempFile = "temp.txt";
        File oldFile = new File(filepath);
        File newFile = new File(tempFile);

        try {
            Scanner scanner = new Scanner(new File(filepath));
            FileWriter fw = new FileWriter(tempFile,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            while (scanner.hasNextLine()){
                String scannedVale= scanner.nextLine();
                if (scannedVale.equals(oldStepsStr))
                {
                    pw.println(newStepsStr);
                }
                else pw.println(scannedVale);
            }
            scanner.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File dump=new File(filepath);
           newFile.renameTo(dump);
        } catch (IOException e) {

            System.out.println("Error");
            throw new RuntimeException(e);
        }

    }
}