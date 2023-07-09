class ram{
    public int a;
    public int ravi(){
        return 5;
    }
    public void ravi2(){
        System.out.println("I am method 2 of class Ram");
    }
}
class shyam extends ram{
    public int b;
    @Override
    public void ravi2(){
        System.out.println("I am method 2 of class Shyam");
    }
}

public class J48_Method_overriding {
    public static void main(String[] args) {
        ram r = new ram();
        r.ravi2();

        shyam s = new shyam();
        s.ravi2();

    }
}
