abstract class Shape {
    public static final float PI = 3.14f;

    public abstract void calculateArea();
}

class Circle extends Shape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        double area;
        area = PI * Math.pow(radius, 2);
        System.out.println("Area of Circle : " + area);
    }
}

class Rectangle extends Shape {
    int length, breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void calculateArea() {
        double area;
        area = length * breadth;
        System.out.println("Area of Rectangle : " + area);
    }
}

class Triangle extends Shape {
    int base, height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public void calculateArea() {
        double area;
        area = 0.5 * base * height;
        System.out.println("Area of triangle : " + area);
    }
}

class calculateAreaUsingAbstractClass {
    public static void main(String args[]) {
        Shape s = new Circle(5);
        s.calculateArea();
        s = new Rectangle(10, 15);
        s.calculateArea();
        s = new Triangle(5, 25);
        s.calculateArea();
    }
}
