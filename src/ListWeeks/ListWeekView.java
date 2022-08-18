package ListWeeks;

import utils.PrintHandler;

import java.util.List;

public class ListWeekView {
    public ListWeekView(List<String> menuOptions) {
        PrintHandler.clearScreen();
        PrintHandler.appTitle();
        System.out.println("List of all weeks:");
        PrintHandler.pintList(menuOptions);
        optionSelectMsg();
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

    public void optionSelectMsg() {
        System.out.print("Enter 1 to view current week and 0 to go back");
    }

}
