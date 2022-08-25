package ListWeeks;

import utils.PrintHandler;

import java.util.List;

public class ListWeekView {
    public ListWeekView(List<String> menuOptions) {
        PrintHandler.clearScreen();
        PrintHandler.appTitle();
        System.out.println("List of all weeks:");
        PrintHandler.printOptionList(menuOptions);
        PrintHandler.goBack();
        printUserPrompt();
    }

    public void printInvalidOption() {
        System.out.println("⚠️ Invalid option");
    }

    public void printUserPrompt() {
        System.out.print("Choose an week and press enter: ");
    }

}
