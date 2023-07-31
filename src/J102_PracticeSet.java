// import java.util.Date;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Calendar;


public class J102_PracticeSet {
    public static void main(String[] args) {
        //P#1
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(65);
        ar.add(64);
        ar.add(66);
        ar.add(67);
        ar.add(34);
        ar.add(78);
        ar.add(62);
        ar.add(69);
        ar.add(54);
        for(Object o:ar){
            System.out.println(o);
        }

        //P#2
        // Date d = new Date();
        // System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

        //P#3
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        //P#4
        HashSet<Integer> hs = new HashSet<>();
        hs.add(56);
        hs.add(53);
        hs.add(51);
        hs.add(58);
        hs.add(59);
        System.out.println(hs);
    }
}
