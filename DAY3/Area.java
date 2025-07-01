
abstract class Shape {

    private final double d1, d2;
    

    public Shape(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }

    public double getD1() {
        return d1;
    }

    public double getD2() {
        return d2;
    }

    abstract public double area();
}

class Rectangle extends Shape {

    public Rectangle(double d1, double d2) {
        super(d1, d2);
    }

    @Override
    public double area() {
        return getD1() * getD2();
    }
}

class Triangle extends Shape {

    public Triangle(double d1, double d2) {
        super(d1, d2);
    }

    @Override
    public double area() {
        return getD1() * getD2() / 2;
    }
}

class Circle extends Shape {

    public Circle(double d1) {
        super(d1, d1);
    }

    @Override
    public double area() {
        return getD1() * getD1() * Math.PI;
    }
}

public class Area {

    public static void main(String args[]) {
        // Shape sh = new Shape(10, 20);
        Rectangle rect = new Rectangle(10, 20);
        Triangle tri = new Triangle(10, 20);
        Circle cl = new Circle(10);
        System.out.println("Area of Rectangle:" + rect.area());
        System.out.println("Area of Rectangle:" + tri.area());
        System.out.println("Area of Rectangle:" + Math.round(cl.area()));

    }
}
