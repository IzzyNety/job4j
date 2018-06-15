package ru.job4j.condition;

/**
 * @author Ilya Astafiev (izzy.nety@gmai.com)
 * @version $id$
 * @since 0.1
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public static double pow (double a, double b){
        return StrictMath.pow(a, b);
    }

    public double distanceTo(Point that) {
     return Math.sqrt(
             Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2)
     );
    }

    public static void main(String[] args) {
        Point a = new Point(0,1);
        Point b = new Point(2, 5);
        System.out.println("x1 = " + a.x);
        System.out.println("y1 = " + a.x);
        System.out.println("x2 = " + b.x);
        System.out.println("y2 = " + b.y);
        double result = a.distanceTo(b);
        System.out.println("Растояние между точками А и В : " + result);
    }
}
