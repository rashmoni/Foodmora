package UserSelection;

import java.io.FileNotFoundException;

public class SelectUser {
    public SelectUser() throws FileNotFoundException {
        SelectUserModel model = new SelectUserModel();
        SelectUserView view = new SelectUserView(model.getUserOptions());
        SelectUserController controller = new SelectUserController(model, view);

        controller.requestUserInput();
    }
}
