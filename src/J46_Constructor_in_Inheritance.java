class Base1{
    int x;
    Base1(){
        System.out.println("I am a Base Constructor");
    }
    Base1(int a){
        System.out.println("I am a overloaded Base Constructor holding value: "+a);
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    
}

class Derived1 extends Base1{
    int y;
    
    Derived1(){
        // super(4);
        System.out.println("I am a derived class constructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am a overloaded derived class constructor holding value: "+x+" "+y);
    }
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
}

class childOfDerived1 extends Derived1{
    childOfDerived1(){
        System.out.println("I am a child of derived class constructor");
    }
    childOfDerived1(int p, int q, int r){
        super(p,q);
        System.out.println("I am a overloaded derived class constructor holding value: "+p+" "+q+" "+r);
    }
}

public class J46_Constructor_in_Inheritance {
    public static void main(String[] args) {
        // Base1 b = new Base1();
        // Derived1 d = new Derived1(8,9);
        // childOfDerived1 cd = new childOfDerived1(1,3,5);
    }
}
