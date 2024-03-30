interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

class Rectangle implements Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length*breadth;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(length + breadth);
    }
}

class Circle implements Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Square implements Shape {
    private double side;
    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side*side;
    }

    @Override
    public double calculatePerimeter() {
        return 4*side;
    }
}

class ShapeProcessor {
    private Shape shape;

    public ShapeProcessor(Shape shape) {
        this.shape = shape;
    }

    public void display() {
        System.out.println("Area : "+ shape.calculateArea());
        System.out.println("Perimeter : "+ shape.calculatePerimeter());
    }
}
public class Assignment2 {
    public static void main(String[] args) {
        Circle circle = new Circle(6);
        Rectangle rectangle = new Rectangle(20, 40);
        Square square = new Square(6);

        ShapeProcessor circleProcessor = new ShapeProcessor(circle);
        ShapeProcessor rectangleProcessor = new ShapeProcessor(rectangle);
        ShapeProcessor squareProcessor = new ShapeProcessor(square);

        System.out.println("\nRectangle :- ");
        rectangleProcessor.display();

        System.out.println("\nCircle :- ");
        circleProcessor.display();

        System.out.println("\nSquare :-");
        squareProcessor.display();
    }
}
