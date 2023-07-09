interface sampleInterface{
    void meth1();
    void meth2();
}

interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}

class mySampleClass implements childSampleInterface{
    public void meth3(){
        System.out.println("Meth3");
    }
    public void meth4(){
        System.out.println("Meth4");
    }
    public void meth1(){
        System.out.println("Meth1");
    }
    public void meth2(){
        System.out.println("Meth2");
    }
}

public class J58_Inheritance_in_Interface {
    public static void main(String[] args) {
        mySampleClass sc = new mySampleClass();
        sc.meth1();
        sc.meth2();
        sc.meth3();
        sc.meth4();
    }
}
