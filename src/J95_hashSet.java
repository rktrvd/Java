import java.util.HashSet;

public class J95_hashSet {
    public static void main(String[] args) {
        HashSet<Integer> HS = new HashSet<>(6, 0.5f);
        HS.add(5);
        HS.add(78);
        HS.add(55);
        HS.add(34);
        System.out.println(HS.size());
        System.out.println(HS);
    }
}
