interface camera{
    void takeSnap();
    void recordVideo();
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

}

public class J59_Polymorphism {
    public static void main(String[] args) {
        camera cm = new smartPhone();
        cm.recordVideo();
        // cm.getNetwork();  //This is not allowed due to polymorphism, we can only use camera

        smartPhone sm = new smartPhone();
        sm.callNumber();
        sm.recordVideo();
        sm.connectNetwork();
    }
}
