package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FilePathReader {
    public static String stepPath;
    public static String IngPath;
    public static String userWeekPath;

    public FilePathReader() throws IOException {
        String path = System.getProperty("user.dir")+"/project.properties";
        FileInputStream fs = new FileInputStream(path);
        Properties prop = new Properties();
        prop.load(fs);
        IngPath = prop.getProperty("ingredients");
        stepPath = prop.getProperty("steps");
        userWeekPath = prop.getProperty("userweek");

    }
}
