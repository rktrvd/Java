import java.lang.Math;

public class J29_Reverse_Array {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 81, 91};
        int l = arr.length;
        int n = Math.floorDiv(arr.length, 2);
        int temp;

        for (int i = 0; i<n; i++){
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }

        for (int element:arr){
            System.out.print(element+" ");
        }
    }
}
