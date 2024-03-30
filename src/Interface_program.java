interface Shape1 {
    //abstract method
    double area();
    void display();
}

//Implementation the Shape1 interface in a class
class Circle1 implements Shape1 {
    double radius;
    //class constructor creation
    public Circle1(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void display() {
        System.out.println("Area of circle : "+area());
    }
}

public class Interface_program {
    public static void main(String[] args) {
        Circle1 c = new Circle1(2);
        c.area();
        c.display();
    }
}
