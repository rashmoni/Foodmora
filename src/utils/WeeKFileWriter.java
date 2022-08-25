package utils;

import Data.Week;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class WeeKFileWriter {

    public static void writeToFile(Week newWeek) throws IOException {
        File userData = new File("assets/userdata.txt");
        List<String> data = newWeek.getWeek();
        String delim = ",";
        String dataString = String.join(delim,data);

        java.io.FileWriter dataWriter = new java.io.FileWriter(userData, true);
        PrintWriter dataOut = new PrintWriter(dataWriter);
        dataOut.print("\n"+dataString);
        dataOut.close();
        dataWriter.close();
    }
}
