class song{
    public void oldsong(){
        System.out.println("This is old song");
    }
    public void newsong(){
        System.out.println("This is new song");
    }
}
class rap extends song{
    @Override
    public void oldsong(){
        System.out.println("This is old rap song");
    }
    public void newRap(){
        System.out.println("This is old rap");
    }
}

public class J49_Dynamic_method_dispatch {
    public static void main(String[] args) {
        // song s = new song();
        // s.oldsong();

        // Super class reference can create subclass object
        song s1 = new rap();
        // rap r = new song();  //Sub class reference cannot create Super class object - Not allowed
       
        s1.newsong();
        s1.oldsong();  //This will run the subclass overrided method
        // s1.newRap();  Not allowed

        
    }
}
