public class OverloadedArea {
    public static double area(double side) {
        return side * side;
    }
    
    public static double area(double length, double breadth) {
        return length * breadth;
    }
    
    public static void main(String[] args) {
        double side = 5.0;
        double length = 4.0;
        double breadth = 6.0;
        double area1 = area(side);
        double area2 = area(length, breadth);
        System.out.println("Area of square with side " + side + " is " + area1);
        System.out.println("Area of rectangle with length " + length + " and breadth " + breadth + " is " + area2);
    }
}
