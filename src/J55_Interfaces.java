interface Bicycle{
    int a = 67;
    void applyBreak(int decrement);
    void speedUp(int increment);
}

interface Radha{
    void radha2();
    void radha3();
}

class AvonCycle implements Bicycle, Radha{
    void blowHorn(){
        System.out.println("The horn is blowing");
    }
    public void applyBreak(int decrement){
        System.out.println("The break is applied");
    }
    public void speedUp(int increment){
        System.out.println("The speed is increasing");
    }
    public void radha2(){
        System.out.println("Radha Radha");
    }
    public void radha3(){
        System.out.println("Radha Radha Radha");
    }
}

public class J55_Interfaces {
    public static void main(String[] args) {
        AvonCycle av = new AvonCycle();
        av.applyBreak(2);
        // We can create the properties in interface.
        // System.out.println(av.a);

        // av.a = 567;   We cannot modify the properties in interface as they are final.
        
        //We can implement multipe interface to single class
        av.radha3();
    }
}
