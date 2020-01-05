package Test.com;

import java.awt.*;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while (number != 0) {
            while (scanner.hasNextLine()) {
                double x1 = scanner.nextDouble();
                double y1 = scanner.nextDouble();
                double x2 = scanner.nextDouble();
                double y2 = scanner.nextDouble();
                double x3 = scanner.nextDouble();
                double y3 = scanner.nextDouble();
                Points p1 = new Points(x1,y1);
                Points p2 =new Points(x2,y2);
                Points p3 =new Points(x3,y3);
                Triangle triangle = new Triangle(p1,p2,p3);
                triangle.getLine();
            }
            number--;
            /*String line =scanner.nextLine();
            double x1 =Character.getNumericValue(line.charAt(0));
            double y1 =Character.getNumericValue(line.charAt(1));
            double x2 =Character.getNumericValue(line.charAt(2));
            double y2 =Character.getNumericValue(line.charAt(3));
            double x3 =Character.getNumericValue(line.charAt(4));
            double y3 =Character.getNumericValue(line.charAt(5));
            Points p1= new Points(x1,y1);*/
        }
    }
}
class Triangle{
    Points p1;//為甚麼不能打point
    Points p2;
    Points p3;
    double l1;
    double l2;
    double l3;
    Triangle(Points p1,Points p2,Points p3){
        this.p1 =p1;//為甚麼要這個
        this.p2=p2;
        this.p3=p3;
        l1=Math.pow(Math.pow(p1.x-p2.x,2)+Math.pow(p1.y-p2.y,2),0.5);
        l2=Math.pow(Math.pow(p1.x-p3.x,2)+Math.pow(p1.y-p3.y,2),0.5);
        l3=Math.pow(Math.pow(p3.x-p2.x,2)+Math.pow(p3.y-p2.y,2),0.5);
    }
    boolean isTriangle(){
        if ((p1.x-p2.x)*(p1.y-p3.y)==(p1.x-p3.x)*(p1.y-p2.y)){
            return false;
        }
        else
            return  true;
    }
    double getArea(){//應該不用建構職吧
        double s =(l1+l2+l3)/2;
        double result =0;
        return Math.pow(s*(s-l1)*(s-l2)*(s-l3),0.5);
    }
    void getLine(){
        if (isTriangle()){
            double maxL=(l1>l2)?(l1>l3?l1:l3):(l2>l3?l2:l3);
            double minL=(l1<l2)?(l1<l3?l1:l3):(l2<l3?l2:l3);
            double midL=(l1>l2)?(l1<l3?l1:(l2>l3?l2:l3)):(l2<l3?l2:(l1>l3?l1:l3));
            System.out.println(minL +" "+midL+" "+maxL+" "+getArea());
        }else
            System.out.println("Just line");
    }
}
class Points{
    double x;
    double y;
    Points(double x ,double y){
        this.x=x;
        this.y =y;
    }
}
