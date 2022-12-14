package UserMenu;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class UserMenuController {
    private final UserMenuView view;
    private final UserMenuModel model;
    private final Scanner scanner;

    public UserMenuController(UserMenuModel model, UserMenuView view) {
        this.model = model;
        this.view = view;
        this.scanner = new Scanner(System.in);
    }

    public void requestUserInput() throws IOException {
        String input = scanner.nextLine();

        try {
            int selectedOption = Integer.parseInt(input);

            model.handleOption(selectedOption);
        }
        catch (NumberFormatException | IndexOutOfBoundsException | FileNotFoundException exception) {
            view.printInvalidOption();
            view.printUserPrompt();
            requestUserInput();
        }
    }
}
