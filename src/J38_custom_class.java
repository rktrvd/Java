class employee{
    int id; 
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My name id "+id+" and my salary is "+salary);
    }
}

class square{
    private float length, breadth;

    public void set_length(float len){
        length = len;
    }
    public void set_breadth(float brd){
        breadth = brd;
    }
    public float get_area(){
        float area = breadth*length;
        return area;
    }
}

public class J38_custom_class {
    
    public static void main(String[] args) {
        System.out.println("This is a custom class");
        employee Ravi = new employee();
        Ravi.id = 101;
        Ravi.salary = 20;
        Ravi.printDetails();

        employee Ram = new employee();
        Ram.id = 102;
        Ram.salary = 200;
        Ram.printDetails();

        square s1 = new square();
        s1.set_breadth(5);
        s1.set_length(8);
        System.out.println(s1.get_area());

    }
}
