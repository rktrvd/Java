abstract class parent{
    public parent(){
        System.out.println("I am parent class constructor");
    }
    public void sayHello(){
        System.out.println("Hello !!");
    }
    abstract public void greet();
    abstract public void greet2();
}

// when a child inherit parent class then it must either define the abstract method of parent class 
// Class which define all the abstract method of a parent class, is a concrete class.
class child extends parent{
    @Override
    public void greet(){
        System.out.println("Namaste");
    }
    @Override
    public void greet2(){
        System.out.println("Ram Ram");
    }
}

// or must be an abstract child class
abstract class child2 extends parent{
    public void ask(){
        System.out.println("How are you?");
    }
}

public class J53_AbstractClass {
    public static void main(String[] args) {
        // child2 ch2 = new child2(); //We can not create an object of abstract class without definition.
        child ch = new child();
        ch.greet2();
    }
}
