package ListWeeks;

import java.io.FileNotFoundException;

public class ListWeeks {
    public ListWeeks() throws FileNotFoundException {
        ListWeekModel model = new ListWeekModel();
        ListWeekView view = new ListWeekView(model.getMenuOptions());
        ListWeekController controller = new ListWeekController(model, view);

        controller.requestUserInput();

    }
}
