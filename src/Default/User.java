package Default;

import ListWeeks.*;
import GenerateWeek.*;

import java.io.FileNotFoundException;
import java.io.IOException;

public class User extends Person implements IUser {

    @Override
    public void listWeeks() throws FileNotFoundException {
       new ListWeeks();
    }

    @Override
    public void generateWeek() throws IOException {
       new GenerateWeek();
    }

}
