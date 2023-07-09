class myThread3 extends Thread{
    public myThread3(String name){
        super(name);
        // System.out.println("I am a Thread constructor");
    }
    public void run(){
        // while(true){
            System.out.println("I am a Thread");
        // }
    }
}

public class J73_Thread_Constructor {
    public static void main(String[] args) {
        myThread3 mt = new myThread3("Ravi");
        myThread3 mt2 = new myThread3("RajaRam");
        mt.start();
        mt2.start();
        System.out.println("Id of thread is "+mt.threadId());
        System.out.println("Id of thread is "+mt.getName());
        System.out.println("Id of thread is "+mt2.threadId());
        System.out.println("Id of thread is "+mt2.getName());
    }
}
