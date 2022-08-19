package ListRecipes;

import utils.PrintHandler;

import java.util.List;

public class ListRecipesView {
    public ListRecipesView(List<String> menuOptions) {
        PrintHandler.clearScreen();
        PrintHandler.appTitle();
        System.out.println("List of all recipes:");
        PrintHandler.pintList(menuOptions);
        exitMenuView();
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

    public void exitMenuView() {
        System.out.print("press enter to continue ...");
    }
}
