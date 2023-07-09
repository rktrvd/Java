class myThread4 extends Thread{
    String name;
    public myThread4(String name){
        // super(name);
        this.name = name;
        // System.out.println("I am a Thread constructor");
    }
    public void run(){
        while(true){
            System.out.println("I am a Thread "+name);
        }
    }
}

public class J74_Thread_Priority {
    public static void main(String[] args) {
        // Ready queue is maintained by JVM
        myThread4 mt = new myThread4("Ravi");
        myThread4 mt1 = new myThread4("Ram");
        myThread4 mt2 = new myThread4("Shyam");
        myThread4 mt3 = new myThread4("Mohan");
        myThread4 mt4 = new myThread4("Radha");
        mt4.setPriority(5);
        mt1.setPriority(4);
        mt2.setPriority(3);
        mt3.setPriority(Thread.MAX_PRIORITY);
        mt.setPriority(Thread.MIN_PRIORITY);
        mt.start();
        mt1.start();
        mt2.start();
        mt3.start();
        mt4.start();
    }
}
