import java.util.Scanner;

public class J05_TakingInput {
    public static void main(String[] args){
        System.out.println("Taking Input from User");
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter num 1");
        // // int a = sc.nextInt();
        // float a = sc.nextFloat();
        // System.out.println("Enter num 2");
        // // int b = sc.nextInt();
        // float b = sc.nextFloat();
        // float sum = a+b;
        // System.out.println("The sum of these number is ");
        // System.out.println(sum);

        // boolean b1 = sc.hasNextInt();
        // System.out.println(b1);

        // String str = sc.next();
        String str = sc.nextLine();
        System.out.println(str);
        sc.close();
    }
    
}
