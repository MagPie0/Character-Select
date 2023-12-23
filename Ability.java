import java.util.ArrayList;
import java.util.Scanner;

public class Ability{
    public ArrayList<String> playerAbility;

    public ArrayList getAbility(){
        return playerAbility;
    }

    public void chooseAbility(){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Choose from the following abilities\n" 
            + "1. Fire\n"
            + "2. Water\n"
            + "3. Air\n"
            + "4. Earth\n"
            + "User input: ");
        switch (scnr.nextInt()) {
            case 1:
                playerAbility.add("Fire");
                break;
            case 2:
                playerAbility.add("Water");
                break;
            case 3:
                playerAbility.add("Air");
                break;
            case 4:
                playerAbility.add("Earth");
                break;
            default:
                System.out.println("Error");
                break;
        }
        
    }
}