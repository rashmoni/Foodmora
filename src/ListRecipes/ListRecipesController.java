package ListRecipes;

import DieticianMenu.DieticianMenu;
import UserMenu.UserMenu;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ListRecipesController {
    private final ListRecipesView view;
    private final ListRecipesModel model;
    private final Scanner scanner;
    private final String typeOfUser;

    public ListRecipesController(ListRecipesModel model, ListRecipesView view, String typeOfUser) {
        this.model = model;
        this.view = view;
        this.scanner = new Scanner(System.in);
        this.typeOfUser = typeOfUser;
    }

    public void requestUserInput() throws FileNotFoundException {
        String input = scanner.nextLine();
        if(typeOfUser.equalsIgnoreCase("user"))
        new UserMenu();
        else new DieticianMenu();
    }
}
