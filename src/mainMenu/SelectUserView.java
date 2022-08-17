package mainMenu;

import java.util.List;
import utils.*;

public class SelectUserView {
    public SelectUserView(List<String> menuOptions) {
        PrintHandler.clearScreen();
        PrintHandler.appTitle();
        System.out.println("Main menu options:");
        PrintHandler.optionList(menuOptions);
        printRequest();
    }

    public void printInvalidOption() {
        System.out.println("⚠️ Invalid option");
    }

    public void printRequest() {
        System.out.print("Choose an option press enter: ");
    }
}
