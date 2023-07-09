class circle{
    float radius;
    circle(float r){
        this.radius=r;
    }
    public double getArea() {
        return Math.PI*this.radius*this.radius;
    }  
}

class cylinder extends circle{
    public float height;
    cylinder(float r, float h){
        super(r);
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
    
}

public class J52_ProblemStatements{
    public static void main(String[] args) {
        //Problem 1
        //Create a class circle and use inheritance to create another class cylinder from it.
        cylinder c1 =  new cylinder(4, 8);
        System.out.println("The volume of Cylinder is: "+c1.volume());
        System.out.println("The area of circle is: "+c1.getArea());
    }
}