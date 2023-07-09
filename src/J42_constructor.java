class get_mantra{
    String godname = "Durga";

    // This is constructor and it automatically initiated when no assignment done outside.
    // It overlap the values assigned internally.
    // public get_mantra(){
    //     godname = "Hanuman";
    // }

    // The constructors can be parameterized.
    public get_mantra(String name){
        godname = name;
    }
    
    // The constructors can also be overloaded.
    public get_mantra(String name1, String name2){
        godname = name1+" and "+name2;
    }

    public String prabhu_mantras(){
        if(godname != null){
            return "This is "+godname+" stuti.";
        } else{
            System.out.println("Please enter valid name.");
            return null;
        }
    }
}

public class J42_constructor {
    public static void main(String[] args) {
        System.out.println("This is devotional program");
        // get_mantra gm = new get_mantra();
        
        // Parameterized constructor invoked here
        get_mantra gm = new get_mantra("Hanuman");

        // Constructor overloading
        get_mantra gm2 = new get_mantra("Ram","Sita");
        
        // gm.godname = "Shiv";
        System.out.println(gm.prabhu_mantras());
        System.out.println(gm2.prabhu_mantras());
    }
}
