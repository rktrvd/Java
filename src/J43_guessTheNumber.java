import java.util.Random;
import java.util.Scanner;

class randomNumber{
    int num;
    public randomNumber(){
        Random r_num = new Random();
        num = r_num.nextInt(1,101);
    }
    public int get_random(){
        return num;
    }
}

public class J43_guessTheNumber {
    static int userInput(){
        System.out.println("Please enter the no between 1 to 100.");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();  //We can't close the scanner until we read all the input.
        return input;
    }

    static int isCorrectNum(int input, int r_num){
        if(input > r_num){
            System.out.println("Your no. is greater.");
            return 1;
        }
        else if(input < r_num){
            System.out.println("Your no. is smaller.");
            return 0;
        }
        else{
            System.out.println("Yeah! You did it.");
            return 2;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("This is a Guess The Number game.");
        randomNumber num = new randomNumber();
        int r_num = num.get_random();
        int result = 0, cnt = 0;
        do{
            int input = userInput();
            result = isCorrectNum(input, r_num);
            cnt++;
        }
        while(result < 2);
        System.out.println("You guessed it in "+cnt+" round.");
    }
}
