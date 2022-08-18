package ListWeeks;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ListWeekController {
    private final ListWeekView view;
    private final ListWeekModel model;
    private final Scanner scanner;

    public ListWeekController(ListWeekModel model, ListWeekView view) {
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
