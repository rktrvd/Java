class myThread extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("My thread is running");
            System.out.println("Radhe Radhe");
        }
    }
}

class myThread2 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("My thread2 is running");
            System.out.println("Har Har Mahadev");
        }
    }
}

// Implementing of extending the thread class to achieve multithreading.
public class J70_MultiThreading {
    public static void main(String[] args) {
        myThread mt = new myThread();
        myThread2 mt2 = new myThread2();
        mt.start();
        mt2.start();
    }
}
