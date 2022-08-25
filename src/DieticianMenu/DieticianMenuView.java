package DieticianMenu;

import utils.PrintHandler;

import java.util.List;

public class DieticianMenuView {
    
    public DieticianMenuView(List<String> menuOptions) {
        PrintHandler.clearScreen();
        PrintHandler.appTitle();
        System.out.println("Dietician Menu:");
        PrintHandler.printOptionList(menuOptions);
        PrintHandler.switchToUser();
        printRequest();
    }
    public void printInvalidOption() {
        System.out.println("⚠️ Invalid option");
    }

    public void printRequest() {
        System.out.print("Choose an option and press enter: ");
    }

}
