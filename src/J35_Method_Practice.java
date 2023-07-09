public class J35_Method_Practice {
    static void pattern(int n){
        int i,j;
        for(i=n; i>=0; i--){
            for(j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern_recursion(int n){
        if(n>0){
            pattern_recursion(n-1);
            for(int j=0; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int sum_natural(int n){
        if(n==1){
            return 1;
        }
        return n + sum_natural(n-1);
    }
    
    public static void main(String[] args) {
        // Problem 2, 4:
        // pattern(7);

        // Problem 3
        // System.out.println(sum_natural(5));

        // Problem 8:
        pattern_recursion(7);
    }
}
