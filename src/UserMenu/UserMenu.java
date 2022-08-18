package UserMenu;

import java.io.FileNotFoundException;
import java.io.IOException;

public class UserMenu {
    public UserMenu() throws FileNotFoundException {
        UserMenuModel model = new UserMenuModel();
        UserMenuView view = new UserMenuView(model.getMenuOptions());
        UserMenuController controller = new UserMenuController(model, view);

        try {
            controller.requestUserInput();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
