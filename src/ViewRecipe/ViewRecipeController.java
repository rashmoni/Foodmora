package ViewRecipe;

import DieticianMenu.DieticianMenu;
import UserMenu.UserMenu;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ViewRecipeController {
    private final ViewRecipeView view;
    private final ViewRecipeModel model;
    private final Scanner scanner;

    String typeOfUser;

    public ViewRecipeController(ViewRecipeModel model, ViewRecipeView view, String typeOfUser) {
        this.model = model;
        this.view = view;
        this.scanner = new Scanner(System.in);
        this.typeOfUser = typeOfUser;
    }

    public void requestUserInput() {
        String input = scanner.nextLine();

        try {
            int selectedOption = Integer.parseInt(input);

            model.handleOption(selectedOption);
            view.printRec(model.getRecipe());
            view.exitMenuView();
            scanner.nextLine();
            if(typeOfUser.equalsIgnoreCase("user"))
                new UserMenu();
            else new DieticianMenu();
        } catch (NumberFormatException | IndexOutOfBoundsException | FileNotFoundException exception) {
            view.printInvalidOption();
            view.printUserPrompt();
            requestUserInput();
        }
    }
}
