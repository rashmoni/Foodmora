package DieticianMenu;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class DieticianMenuController {
    private final DieticianMenuView view;
    private final DieticianMenuModel model;
    private final Scanner scanner;

    public DieticianMenuController(DieticianMenuModel model, DieticianMenuView view) {
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
        catch (NumberFormatException | IndexOutOfBoundsException | FileNotFoundException | IIOException exception) {
            view.printInvalidOption();
            view.printRequest();
            requestUserInput();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
