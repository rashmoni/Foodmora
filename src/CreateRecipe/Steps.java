package CreateRecipe;

import utils.UserInput;

import java.util.ArrayList;
import java.util.List;

public class Steps {
    static UserInput input = new UserInput();
    public static List<String> steps = new ArrayList<>();
    public Steps(){
        inputSteps();
    }

    public static List<String> getSteps(){
        return steps;
    }
    public void inputSteps() {
        boolean takeStepInput = true;
        while (takeStepInput) {
            String Step = "";
            int anotherInput;

            Step = Step + input.readText("Please Enter a step: ");
            System.out.println("[1] Enter More Steps: ");
            System.out.println("[0] Save: ");
            steps.add(Step);
            anotherInput = input.readInteger("Select 1 for more input: ", "Invalid input", 0, 1);
            if (anotherInput == 0) {
                takeStepInput = false;
            }
        }
    }
}
