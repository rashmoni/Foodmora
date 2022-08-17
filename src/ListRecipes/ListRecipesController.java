package ListRecipes;

import userMenu.UserMenuModel;
import userMenu.UserMenuView;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ListRecipesController {
    private final ListRecipesView view;
    private final ListRecipesModel model;
    private final Scanner scanner;

    public ListRecipesController(ListRecipesModel model, ListRecipesView view) {
        this.model = model;
        this.view = view;
        this.scanner = new Scanner(System.in);
    }

    public void requestUserInput() {
        String input = scanner.nextLine();

        try {
            int selectedOption = Integer.parseInt(input);

            model.handleOption(selectedOption);
        }
        catch (NumberFormatException | IndexOutOfBoundsException | FileNotFoundException exception) {
            view.printInvalidOption();
            view.printRequest();
            requestUserInput();
        }
    }
}
