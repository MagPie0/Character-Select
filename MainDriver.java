import java.util.ArrayList;
import java.util.Scanner;
public class MainDriver {
    public static void main(String[] args) {
        ArrayList<String> Player = new ArrayList<>();
        Scanner scnr = new Scanner (System.in);
        char userAnswer;
        OpeningDialog();
        
        while (!Continue()) {
            clearConsole();
            OpeningDialog();
        }


    }

    private static void OpeningDialog(){
        System.out.println("Welcome to the character select!\n" 
            + "You will be asked a series of questions regarding what you want for your character\n" 
            + "Please note that your character will automatically be saved throughout the character select\n" 
            + "Type Y to continue: ");
    }

    private static boolean Continue(){
        Scanner scnr = new Scanner (System.in);
        char userAnswer = scnr.next().charAt(0);
        if (userAnswer == 'Y' || userAnswer == 'y') {
            return true;
        } else if (userAnswer == 'N' || userAnswer == 'n') {
            return false;
        } else {
            System.out.println("Invalid answer, please type Y or N");
            return false;
        }
    }

    public static void clearConsole() {
        // Prints 50 empty lines to "clear" the console
        for (int i = 0; i < 50; ++i) System.out.println();
    }
}
