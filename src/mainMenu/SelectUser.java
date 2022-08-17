package mainMenu;

import java.io.FileNotFoundException;

public class SelectUser {
    public SelectUser() throws FileNotFoundException {
        SelectUserModel model = new SelectUserModel();
        SelectUserView view = new SelectUserView(model.getMenuOptions());
        SelectUserController controller = new SelectUserController(model, view);

        controller.requestUserInput();
    }
}
