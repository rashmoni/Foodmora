package utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateRecipePrintHandler {

    public void getRecipeInput() throws IOException {
        RecipeFileReader recipes = new RecipeFileReader();
        List<Recipe> allRecipes= recipes.generateRecipes();
        int totalRecipes = allRecipes.size();
        String recipeName;
        List<String> ingredients = new ArrayList<>();
        List<String> steps = new ArrayList<>();
        int numberOfIngredients = 0;
        int numberOfSteps = 0;
        boolean takeIngInput = true;
        boolean takeStepInput = true;

        System.out.print("Please Enter Recipe Name: ");
        Scanner scanner = new Scanner(System.in);
        recipeName = scanner.nextLine();

        while(takeIngInput){
            String ingredient = "";
            UserInput input = new UserInput();
            int selectIngType;
            String amount;
            int anotherInput;

            System.out.print("Please Enter Ingredient name: ");
            ingredient.concat(scanner.nextLine());

            System.out.println();
            System.out.println("[1] Quantity (pc)");
            System.out.println("[2] Liters (l)");
            System.out.println("[3] Kilogram (kg)");

            selectIngType= input.readInteger("Please select ingredients measurement: ", "Invalid input", 1, 3);
            switch (selectIngType){

                case 1: ingredient.concat(" pc");
                case 2: ingredient.concat(" l");
                case 3: ingredient.concat(" kg");

            }
            amount = input.readText("Please Enter measurement amount: ");
            ingredient.concat(amount);

            if (ingredient!=null && ingredient!=" "){
                ingredients.add(ingredient);
            }
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
            System.out.println("[0] Exit: ");

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

}
