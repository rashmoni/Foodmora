package UserSelection;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class SelectUserController {
    private final SelectUserView view;
    private final SelectUserModel model;
    private final Scanner scanner;

    public SelectUserController(SelectUserModel model, SelectUserView view) {
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
