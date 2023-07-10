import java.util.*;

public class J91_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(16);
        l2.add(15);
        l2.add(17);
        l1.add(6);
        l1.add(5);
        l1.add(7);
        l1.add(0,9);
        l1.addAll(l2);
        l1.add(6);
        // l1.clear();
        System.out.println(l1.contains(23));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));

        l1.set(4, 88);

        for(int i = 0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(" , ");
        }
    }
}
