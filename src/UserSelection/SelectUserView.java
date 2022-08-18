package UserSelection;

import java.util.List;
import utils.*;

public class SelectUserView {
    public SelectUserView(List<String> menuOptions) {
        PrintHandler.clearScreen();
        PrintHandler.appTitle();
        System.out.println("Main menu options:");
        PrintHandler.optionList(menuOptions);
        printUserPrompt();
    }

    public void printInvalidOption() {
        System.out.println("⚠️ Invalid user");
    }

    public void printUserPrompt() {
        System.out.print("Choose an option press enter: ");
    }
}
