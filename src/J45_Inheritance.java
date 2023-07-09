class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void printme(){
        System.out.println("I am Base class constructor");
    }
}

class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void printme(){
        System.out.println("I am derived class constructor");
    }
}

public class J45_Inheritance {
    public static void main(String[] args) {
        //Creating an object of Base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        //Creating an object of Derived class
        Derived d = new Derived();
        d.setX(4);
        d.printme();
        System.out.println(d.getX());
        d.setY(7);
        System.out.println(d.getY());
    }
}
