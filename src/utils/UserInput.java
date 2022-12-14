package utils;

import java.util.Scanner;

public class UserInput {
    private final Scanner in;
    public UserInput(){
        in = new Scanner(System.in);
    }

    public int readInteger(String promptMsg, String errorMsg, int low, int high){
        int num = 0;
        String strInput;
        boolean valid = false;
        while (!valid){
            System.out.print(promptMsg);
            strInput = in.nextLine();

            try{
                num = Integer.parseInt(strInput);
                if(num>=low && num <= high)
                    valid=true;
                else
                    System.out.println(errorMsg);
            }
            catch(NumberFormatException e){
                System.out.println(errorMsg);
            }
        }
        return num;
    }

    public String readText(String promptMsg){
        String strInput;
        System.out.print(promptMsg);
        strInput = in.nextLine();

        while ((strInput.equals("") || (strInput.equals(" ")))) {
            System.out.print("\u26A0 Invalid Entry, Please enter valid recipe name: ");
            strInput = in.nextLine();
            strInput.trim();
        }
        return strInput;
    }

    public void pressEnterContinue(){
        System.out.print("Press Enter to continue...");
        in.nextLine();
    }

    public void oprationSaveSuccess(){
        System.out.print("Operation successfully completed, press enter to continue..");
        in.nextLine();
    }

    public String slectIngType(String promptMsg){
        String strInput;
        System.out.print(promptMsg);
        strInput = in.nextLine();
        boolean validInput = (!strInput.equalsIgnoreCase("kg")) && (!strInput.equalsIgnoreCase("l")) && (!strInput.equalsIgnoreCase("pc"));

        while (validInput){
            System.out.print("\u26A0 Invalid Entry, Please enter valid search value :");
            strInput = in.nextLine();
            if ((strInput.equalsIgnoreCase("kg")) || (strInput.equalsIgnoreCase("l")) || (strInput.equalsIgnoreCase("pc"))){
                validInput = false;
            }

        }
        return strInput.trim();
    }

}
