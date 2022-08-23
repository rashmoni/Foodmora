package CreateRecipe;

import Data.Recipe;
import Data.RecipePool;
import utils.RecipeFileReader;
import utils.RecipeFileWriter;
import utils.UserInput;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateRecipeHandler {
    Scanner scanner = new Scanner(System.in);
    UserInput input = new UserInput();

    RecipePool pool = new RecipePool();

    public CreateRecipeHandler() throws FileNotFoundException {
    }

    public void getRecipeInput() throws IOException {
        RecipeFileReader recipes = new RecipeFileReader();
        List<Recipe> allRecipes = pool.getRecipes();
        int totalRecipes = pool.getTotalRecipeCount();
        String recipeName;
        List<String> ingredients = new ArrayList<>();
        List<String> steps = new ArrayList<>();
        boolean takeIngInput = true;
        boolean takeStepInput = true;

        recipeName = input.readText("Please Enter Recipe Name: ");

        while(takeIngInput){
            int anotherInput;
            ingredients = inputIngredients();
            System.out.println("[1] Enter More Ingredients: ");
            System.out.println("[0] Enter Steps: ");
            anotherInput= input.readInteger("Select 1 for more input: ", "Invalid input", 0, 1);
            if (anotherInput==0){
                takeIngInput=false;

            }

        }

        while(takeStepInput){
            UserInput input = new UserInput();
            String Step= "";
            int anotherInput;

            Step = Step + input.readText("Please Enter steps: ");
            System.out.println("[1] Enter More Steps: ");
            System.out.println("[0] Save: ");

            if (Step!=null && Step!=" "){
                steps.add(Step);
            }
            anotherInput= input.readInteger("Select 1 for more input: ", "Invalid input", 0, 1);
            if (anotherInput==0){
                takeStepInput=false;
            }

        }

        Recipe rc = new Recipe(totalRecipes+1, recipeName, ingredients, steps);

        RecipeFileWriter writer = new RecipeFileWriter();
        writer.writeToFile(rc);
        System.out.println(rc);
    }

    public List<String> inputIngredients(){
        List<String> ingredients = new ArrayList<>();
        String ingredient = "";
        String selectIngType;
        String amount;


        ingredient= input.readText("Please enter ingredient name: ");


        selectIngType= input.slectIngType("Please select ingredients measurement type (pc/l/kg): ");
        ingredient= ingredient+" "+selectIngType;

        amount = input.readText("Please Enter measurement amount: ");
        ingredient= ingredient+" "+ amount;

        if (ingredient!="" && ingredient!=" "){
            ingredients.add(ingredient);
        }
        return ingredients;
    }

}
