import java.util.ArrayDeque;

public class J93_arrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.addLast(67);
        ad1.addFirst(89);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
}
