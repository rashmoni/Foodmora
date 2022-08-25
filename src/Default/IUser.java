package Default;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface IUser {
void listWeeks() throws FileNotFoundException;
void generateWeek() throws IOException;
}
