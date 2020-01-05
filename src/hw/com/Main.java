package hw.com;

import java.security.PKCS12Attribute;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* Scanner scanner =new Scanner(System.in);
        int n =1;
        double x1 = 0;
        double y1=0;
        double x2=0;
        double y2=0;
        double x3=0;
        double y3=0;
            do {
                while (scanner.hasNext()) {
                    x1 = scanner.nextDouble();
                    y1 = scanner.nextDouble();
                    x2 = scanner.nextDouble();
                    y2 = scanner.nextDouble();
                    x3 = scanner.nextDouble();
                    y3 = scanner.nextDouble();
                    Point P1 = new Point(x1, y1);
                    Point P2 = new Point(x2, y2);
                    Point P3 = new Point(x3, y3);
                    MyPoint mp = new MyPoint(P1, P2, P3);
                    System.out.println("Triangle" + n);
                    System.out.println("Area:" + mp.getArea());
                    System.out.println("Perimeter:" + mp.getPerimeter());
                    n++;
                }
            }
            while (n<=2);
        System.out.println("4444");*/
    }
}
/*class Point{
    double x;
    double y;
    Point(double x,double y){
        this.x=x;
        this.y=y;
    }
}
class  MyPoint {
    Point P1;
    Point P2;
    Point P3;
    double l1;
    double l2;
    double l3;

    MyPoint(Point P1, Point P2, Point P3) {
        this.P1 = P1;
        this.P2 = P2;
        this.P3 = P3;
        l1 = Math.pow(Math.pow(P1.x - P2.x, 2) + Math.pow((P1.y - P2.y), 2), 0.5);
        l2 = Math.pow(Math.pow(P1.x - P3.x, 2) + Math.pow((P1.y - P3.y), 2), 0.5);
        l3 = Math.pow(Math.pow(P3.x - P2.x, 2) + Math.pow((P3.y - P2.y), 2), 0.5);
    }

    double getX() {
        return getX();
    }

    double getY() {
        return getY();
    }

    double distance() {
        return distance();
    }

    boolean isTriangle() {
        if (l1 + l2 < l3) {
            return false;
        }
        return true;
    }

    double getArea() {
        double s = (l1 + l2 + l3) / 2;
            return Math.pow(s * (s - l1) * (s - l2) * (s - l3),0.5);
    }
    double getPerimeter(){
        return (l1+l2+l3);
    }
}*/

