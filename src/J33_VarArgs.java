public class J33_VarArgs {
    static int sum(int ...arr){
        int result = 0;
        for (int a: arr){
            result += a;
        }
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println("The sum is: " + sum(1,2));
        System.out.println("The sum is: " + sum(1,2,3));
        System.out.println("The sum is: " + sum(1,2,67,45));
    }
}
