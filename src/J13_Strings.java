import java.util.Scanner;

public class J13_Strings {
    public static void main(String[] args) {
        String str = "Ravikant";
        System.out.print("My name is: ");
        System.out.println(str);

        int a = 4;
        float b = 6.5f;
        System.out.printf("The value of a is %d and b is %.2f \n",a,b);
        System.out.format("The value of a is %d and b is %f \n",a,b);
        
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println(str1);
        sc.close();
    }
}
