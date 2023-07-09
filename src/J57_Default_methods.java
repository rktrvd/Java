interface camera{
    void takeSnap();
    void recordVideo();

    //We can define a private method but can only be used locally.
    private void greet(){
        System.out.println("We can see you");
    }

    //it will only call the default value defined in the interface itself until it again implemented in any class.
    default void record4KVideo(){
        greet();
        System.out.println("Recording the 4K video directly");
    }
}

interface wifi{
    String[] getNetwork();
    void connectNetwork();
}

class myCellPhone{
    void callNumber(){
        System.out.println("Calling number...");
    }
    void pickCall(){
        System.out.println("Picking the call");
    }
}

class smartPhone extends myCellPhone implements camera, wifi{
    public void takeSnap(){
        System.out.println("Taking the picture");
    }
    public void recordVideo(){
        System.out.println("Reccording videos");
    }
    public String[] getNetwork(){
        System.out.println("Searching wifi network...");
        String[] networkList = {"Jai shree Ram", "Har Har Mahadev", "Hare Krishna"};
        return networkList;
    }
    public void connectNetwork(){
        System.out.println("Connecting the wifi network...");
    }

    //If default method is implemented in a class then it will use the class value
    // public void record4KVideo(){
    //     System.out.println("Recording the 4K video from Smart Phone");
    // }

}

public class J57_Default_methods {
    public static void main(String[] args) {
        smartPhone sp = new smartPhone();
        sp.callNumber();
        // String[] ar = sp.getNetwork();
        // for(String item: ar){
        //     System.out.println(item);
        // }
        sp.record4KVideo();
    }
}
