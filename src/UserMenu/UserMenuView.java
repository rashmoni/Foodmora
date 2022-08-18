package UserMenu;

import utils.PrintHandler;

import java.util.List;

public class UserMenuView {

    public UserMenuView(List<String> menuOptions) {
        PrintHandler.clearScreen();
        PrintHandler.appTitle();
        System.out.println("User menu:");
        PrintHandler.optionList(menuOptions);
        PrintHandler.switchToDietician();
        printUserPrompt();
    }
    public void printInvalidOption() {
        System.out.println("⚠️ Invalid option");
    }

    public void printUserPrompt() {
        System.out.print("Choose an option and press enter: ");
    }

}
