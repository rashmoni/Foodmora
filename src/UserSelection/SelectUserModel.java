package UserSelection;

import DieticianMenu.DieticianMenu;
import UserMenu.*;

import java.io.FileNotFoundException;
import java.util.List;

public class SelectUserModel {
    private final List<String> userOptions = List.of("User", "Dietician");

    public List<String> getUserOptions() {
        return userOptions;
    }

    public void handleOption(int selectedOption) throws IndexOutOfBoundsException, FileNotFoundException {
        switch (selectedOption) {
            case 1 -> new UserMenu();
            case 2 -> new DieticianMenu();
            default -> throw new IndexOutOfBoundsException();
        }
    }
}
