import java.util.Scanner;

public class J06_Ques {
    public static void main(String[] args) {
        System.out.println("Enter the marks of each 5 subjects out of 100");
        Scanner sc = new Scanner(System.in);

        // float num1 = sc.nextFloat();
        // float num2 = sc.nextFloat();
        // float num3 = sc.nextFloat();
        // float num4 = sc.nextFloat();
        // float num5 = sc.nextFloat();
        
        // float per = ((num1+num2+num3+num4+num5)*100)/500;
        // System.out.println(per);

        System.out.println("Enter your name");
        String str  = sc.next();
        System.out.println("Hello! My name is "+str);
        sc.close();
    }
}
