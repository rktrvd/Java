import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class J20_Rock_Paper_Scissor {
    public static String get_options(int value){
        String choice = "";
        if( value == 1 ){
            choice = "Rock";
        }else if( value == 2 ){
            choice = "Paper";
        }else if( value == 3 ){
            choice = "Scissors";
        }
        return choice;
    }
    public static void main(String[] args) {
        String syschoice, userchoice;
        int i =1;
        Random num = new Random();
        Scanner inp = new Scanner(System.in);

        while (i<4){
            int number = (Math.abs(num.nextInt())%3)+1;
            System.out.println("\nSystem made it's choices\nEnter yours 1: Rock, 2: Paper, 3: Scissor");
            int input = inp.nextInt();
            syschoice = get_options(number);
            userchoice = get_options(input);
            if ((input == 1 && number == 1) || (input == 2 && number == 2) || (input == 3 && number == 3)){
                System.out.printf("System choice: %s, Your choice: %s, Result: No wins! You both have same choice", syschoice,userchoice);
            } else if ((input == 1 && number == 2)||(input == 2 && number == 3)||(input == 3 && number == 1)){
                System.out.printf("System choice: %s, Your choice: %s, Result: System wins", syschoice,userchoice);
            } else if ((input == 2 && number == 1)||(input == 3 && number == 2)||(input == 1 && number == 3)){
                System.out.printf("System choice: %s, Your choice: %s, Result: You wins", syschoice,userchoice);
            }
            i++;
        }
        inp.close();

    }
}
