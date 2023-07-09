class myRunnable implements Runnable{
    @Override
    public void run(){
        while(true){
            System.out.println("My Runnable is Implemented");
            System.out.println("Radhe Radhe");
        }
    }
}

class myRunnable2 implements Runnable{
    @Override
    public void run(){
        while(true){
            System.out.println("My Runnable2 is Implemented");
            System.out.println("Har Har Mahadev");
        }
    }
}

// Implementing thread interface to achieve multithreading.
public class J71_MultiThreading2 {
    public static void main(String[] args) {
        myRunnable run = new myRunnable();
        Thread t1 = new Thread(run);
        myRunnable2 run2 = new myRunnable2();
        Thread t2 = new Thread(run2);

        t1.start();
        t2.start();
    }
}
