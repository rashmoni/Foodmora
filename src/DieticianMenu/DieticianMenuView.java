package DieticianMenu;

import utils.PrintHandler;

import java.util.List;

public class DieticianMenuView {


    public DieticianMenuView(List<String> menuOptions) {
        PrintHandler.clearScreen();
        PrintHandler.appTitle();
        System.out.println("Dietician Menu:");
        PrintHandler.optionList(menuOptions);
        PrintHandler.switchToUser();
        printRequest();
    }
    public void printInvalidOption() {
        System.out.println("⚠️ Invalid option");
    }

    public void printRequest() {
        System.out.print("Choose a song and press enter: ");
    }

    public void printSongNotFoundError() {
        System.out.println("❌️ Cannot play this song");
    }

    public void printSongPlaying() {
        System.out.println("▶️ Playing song");
    }
}
