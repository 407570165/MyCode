package hw.com;

import java.awt.*;
import java.util.Scanner;

public class MainT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                double x1 =scanner.nextDouble();
                double y1 =scanner.nextDouble();
                double x2 =scanner.nextDouble();
                double y2 =scanner.nextDouble();
                double x3 =scanner.nextDouble();
                double y3 =scanner.nextDouble();
                MyPoint p1 =new MyPoint(x1,y1);
                MyPoint p2 =new MyPoint(x2,y2);
                MyPoint p3 =new MyPoint(x3,y3);
                Triangle2D t1 =new Triangle2D(p1,p2,p3);
        System.out.println("Triangle1");
        System.out.println("Area:"+t1.getArea());
        System.out.println("Perimeter:"+t1.getPerimeter());
        double bx1 =scanner.nextDouble();
        double by1 =scanner.nextDouble();
        double bx2 =scanner.nextDouble();
        double by2 =scanner.nextDouble();
        double bx3 =scanner.nextDouble();
        double by3 =scanner.nextDouble();
        MyPoint point1 =new MyPoint(bx1,by1);
        MyPoint point2 =new MyPoint(bx2,by2);
        MyPoint point3 =new MyPoint(bx3,by3);
        Triangle2D t2 =new Triangle2D(point1,point2,point3);
        System.out.println("Triangle2");
        System.out.println("Area:"+t2.getArea());
        System.out.println("Perimeter:"+t2.getPerimeter());
        double textX =scanner.nextDouble();
        double textY =scanner.nextDouble();
        MyPoint myPoint =new MyPoint(textX,textY);
        System.out.println("Triangle1.contains"+"("+(int)textX+","+(int)textY+") = "+t1.contains(myPoint));
        System.out.println("Triangle2.contains"+"("+(int)textX+","+(int)textY+") = "+t2.contains(myPoint));
        System.out.println("contains(Triangle2D) = "+t1.contains(t2));
        System.out.println("overlaps(Triangle2D) = "+t1.overlaps(t2));

    }
}
class MyPoint{
    double x;
    double y;
    MyPoint(){
    }
    public MyPoint(double x,double y){
        this.x =x;
        this.y=y;
    }
    double getX(){
        return x;
    }
    double getY(){
        return y;
    }
    double distance(MyPoint p){
        return Math.pow(Math.pow(this.getX()-p.getX(),2)+Math.pow(this.getY()-p.getY(),2),0.5);
    }
        }
class Triangle2D {
    MyPoint p1;
    MyPoint p2;
    MyPoint p3;
    double l1;
    double l2;
    double l3;
    Line line1;
    Line line2;
    Line line3;

    Triangle2D() {
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(1, 1);
        MyPoint p3 = new MyPoint(2, 5);
    }

    Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        l1 = p1.distance(p2);
        l2 = p2.distance(p3);
        l3 = p3.distance(p1);
        line1 =new Line(p1,p2);
        line2 =new Line(p3,p2);
        line3 =new Line(p1,p3);
    }

    double getArea() {
        double s = (l1 + l2 + l3) / 2;
        return Math.pow((s * (s - l1) * (s - l2) * (s - l3)), 0.5);
    }

    double getPerimeter() {
        return (l1 + l2 + l3);
    }

    boolean contains(MyPoint p) {//這個是第一個
        double ma = 0;
        double mb = 0;
        double mc = 0;
        MyPoint a = new MyPoint(p.getX() - p1.getX(), p.getY() - p1.getY());
        MyPoint b = new MyPoint(p.getX() - p2.getX(), p.getY() - p2.getY());
        MyPoint c = new MyPoint(p.getX() - p3.getX(), p.getY() - p3.getY());
        ma = (a.x * b.y) - (a.y * b.x);
        mb = (b.x * c.y) - (b.y * c.x);
        mc = (c.x * a.y) - (c.y * a.x);
        if ((ma <= 0 && mb <= 0 && mc <= 0) || (ma > 0 && mb > 0 && mc > 0)) {
            return true;
        }
        return false;
    }

    boolean contains(Triangle2D t) {
        return (contains(t.p1) && contains(t.p2) && contains(t.p3));
    }
    boolean isCross(Line line1,Line line2){
        double crossX =(line2.b-line1.b)/(line1.a-line2.a);
        double crossY=line1.a*((line2.b-line1.b)/(line1.a-line2.a))+line1.b;
        if (!(crossY>=line1.startY&&crossY<=line1.endY&&crossX>=line2.startY&&crossX<=line2.endY))
            return false;
        if (!(crossY>=line1.startX&&crossY<=line1.endX&&crossX>=line2.startX&&crossX<=line2.endY))
            return false;
        return true;
    }
    boolean overlaps(Triangle2D t){
        if (t.contains(p1)||t.contains(p2)||t.contains(p3)||this.contains(t.p1)||this.contains(t.p2)||this.contains(t.p3))
        return true;
        if (t.isCross(t.line1,line1)||t.isCross(t.line1,line2)||t.isCross(t.line1,line3))
            return true;
        if (t.isCross(t.line2,line1)||t.isCross(t.line2,line2)||t.isCross(t.line2,line3))
            return true;
        if (t.isCross(t.line3,line1)||t.isCross(t.line3,line2)||t.isCross(t.line3,line3))
            return true;
        return false;
    }
}
class Line{
    MyPoint p1;
    MyPoint p2;
    double startX;
    double endX;
    double startY;
    double endY;
    double a;
    double b;
    Line(MyPoint p1,MyPoint p2){
        this.p1=p1;
        this.p2=p2;
        startX=p1.x>p2.x?p2.x:p1.x;
        endX=p1.x<p2.x?p2.x:p1.x;
        startY=p1.y>p2.y?p2.y:p1.y;
        endY=p1.y<p2.y?p2.y:p1.y;
        a=(p1.y-p2.y)/(p1.x-p2.x);
        b=(p1.x*p2.y-p2.x*p1.y)/(p1.x-p2.x);
    }
}