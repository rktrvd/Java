import java.util.Scanner;

public class J34_Fibonacci_series {
    static void Fibonacci(int num1, int num2, int elements){
        int num3 = num1+num2;
        if(elements>2){
            System.out.print(" "+num3);
            Fibonacci(num2, num3, elements-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter first 2 starting numbers");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Enter the no of elements in series");
        int elements = sc.nextInt();
        if(elements<2){
            System.out.println("The no. of elements can't be less than 2");
        }
        else{
            System.out.print("The fibonacci series is: "+num1+" "+num2);
            Fibonacci(num1, num2, elements);
        }
        sc.close();
    }
}
