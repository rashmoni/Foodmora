package utils;

import java.io.*;
import java.util.Scanner;

public class EditRecordFiles {
    public static void edit(String filepath, String oldStepsStr, String newStepsStr) {

        String tempFile = "temp.txt";
        File oldFile = new File(filepath);
        File newFile = new File(tempFile);

        try {
            Scanner scanner = new Scanner(new File(filepath));
            FileWriter fw = new FileWriter(tempFile,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            while (scanner.hasNextLine()){
                String scannedVale= scanner.nextLine();
                if (scannedVale.equals(oldStepsStr))
                {
                    pw.println(newStepsStr);
                }
                else pw.println(scannedVale);
            }
            scanner.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File dump=new File(filepath);
            newFile.renameTo(dump);
        } catch (IOException e) {

            System.out.println("Error");
            throw new RuntimeException(e);
        }

    }

}
