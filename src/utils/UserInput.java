package utils;

import java.util.Scanner;

public class UserInput {
    private Scanner in;
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
        String strInput = null;
        System.out.print(promptMsg);
        strInput = in.nextLine();

        while ((strInput.equals(""))) {
            System.out.print("\u26A0 Invalid Entry, Please enter valid search value :");
            strInput = in.nextLine();
            strInput.trim();
        }
        return strInput;
    }

}
