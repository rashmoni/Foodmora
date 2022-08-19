import Data.RecipePool;
import UserSelection.SelectUser;
import utils.RecipeFileReader;
import utils.WeekFileReader;

import java.io.*;

public class main {

    public static void main(String[] args) throws FileNotFoundException {

        try {
            new RecipeFileReader();
            new WeekFileReader();
            new SelectUser();
        } catch (FileNotFoundException exception) {
            System.out.println("❌ Can't start the app because the file inside the asset folder is missing");
        }


    }
}
