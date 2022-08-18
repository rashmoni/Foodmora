import java.io.FileNotFoundException;

public interface IUser {
void listWeeks();
void generateWeek();
void viewRecipe();
void listRecipe() throws FileNotFoundException;
}
