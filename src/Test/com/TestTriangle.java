package Test.com;

import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int count =scanner.nextInt();
        while (count>0){
            double data[] =new double[6];
            for (int i=0;i<6;i++){
                data[i]=scanner.nextDouble();
            }
            Point p1=new Point(data[0],data[1]);
            Point p2=new Point(data[2],data[3]);
            Point p3=new Point(data[4],data[5]);
            TestPracticeT triangle =new TestPracticeT(p1,p2,p3);
            triangle.print();
            count--;
        }
    }
}
class Point{
    double x;
    double y;
    Point(){
    }
    Point(double x,double y){
        this.x=x;
        this.y=y;
    }
}
class TestPracticeT{
    Point p1;
    Point p2;
    Point p3;
    double line1;
    double line2;
    double line3;
    TestPracticeT(Point p1,Point p2,Point p3){
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
        line1=Math.pow(Math.pow(p1.x-p2.x,2)+Math.pow(p1.y-p2.y,2),0.5);
        line2=Math.pow(Math.pow(p3.x-p2.x,2)+Math.pow(p3.y-p2.y,2),0.5);
        line3=Math.pow(Math.pow(p1.x-p3.x,2)+Math.pow(p1.y-p3.y,2),0.5);
    }
    boolean isTriangle(){
        if (line1+line2>line3&&line2+line3>line1&&line1+line3>line2)
            return true;
        else
            return false;
    }
    double getArea(){
        double s =0;
        double answer;
        s=(line1+line2+line3)/2;
        answer =Math.pow(s*(s-line1)*(s-line2)*(s-line3),0.5);
        return answer;
    }
      void print(){
        double maxL=line1>line2?(line1>line3?line1:line3):(line2>line3?line2:line3);
        double minL=line1>line3?(line3>line2?line2:line3):(line1<line3?line1:line3);
        double midL=line1>line3?(line3>line2?line3:line1>line2?line2:line1):(line1>line2?line1:line2>line3?line3:line2);
        if (isTriangle()) {
            String max = String.format("%.3f", maxL);
            String mid =String.format("%.3f",midL);
            String min =String.format("%.3f",minL);
            String total =String.format("%.3f",getArea());
            System.out.println(min+" "+mid+" "+max+" "+total);
            //.out.printf("%.3f " + "%.3f " + "%.3f " + "%.3f\n", minL, midL, maxL, getArea());
        }else
            System.out.println("Just Line!");
    }
}
