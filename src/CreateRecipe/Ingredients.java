package CreateRecipe;

import utils.UserInput;

import java.util.ArrayList;
import java.util.List;

public class Ingredients {
    static UserInput input = new UserInput();
    static List<String> ingredients = new ArrayList<>();

    public Ingredients(){
        inputIngredients();
    }

    public static List<String> getIngredients(){
        return ingredients;
    }

    private void inputIngredients(){
        boolean takeIngInput = true;
        while(takeIngInput){
            int anotherInput;
            ingredients = inputIngredient();
            System.out.println("[1] Enter More Ingredients: ");
            System.out.println("[0] Enter Steps: ");
            anotherInput= input.readInteger("Select 1 for more input: ", "Invalid input", 0, 1);
            if (anotherInput==0){
                takeIngInput=false;
            }
        }
    }

    public static List<String> inputIngredient(){
        String ingredient = "";
        String selectIngType;
        String amount;

        ingredient= input.readText("Please enter ingredient name: ");
        selectIngType= input.slectIngType("Please select ingredients measurement type (pc/l/kg): ");
        ingredient = ingredient +" "+ selectIngType;
        amount = input.readText("Please Enter measurement amount: ");
        ingredient= ingredient+" "+ amount;
        if (ingredient!="" && ingredient!=" "){
            ingredients.add(ingredient);
        }
        return ingredients;
    }
}
