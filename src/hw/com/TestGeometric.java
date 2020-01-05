package hw.com;

import java.util.Scanner;

public class TestGeometric {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
            double line1 =scanner.nextDouble();
            double line2 =scanner.nextDouble();
            double line3 =scanner.nextDouble();
            scanner.nextLine();
            String color =scanner.nextLine();
            Boolean filled =scanner.nextBoolean();
            Triangle triangle =new Triangle(line1,line2,line3,color,filled);
            System.out.println("Triangle: side1 = "+line1+" side2 = "
            +line2+" side3 = "+line3);
            System.out.println("The area is "+triangle.getArea());
            System.out.println("The perimeter is "+triangle.getPerimeter());
            System.out.println(color);
            System.out.println(filled);
    }
}
class Geometric {
    private String color="white";
    private boolean filled ;
    public Geometric(){
    }
    public Geometric(String color ,boolean filled){
        this.color=color;
        this.filled=filled;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    public String toString(){
        return color +"\n"+filled;
    }
}
class Triangle extends Geometric{
    double line1;
    double line2;
    double line3;
    public Triangle(double line1,double line2,double line3,String color,boolean filled){
        this.line1 =line1;
        this.line2=line2;
        this.line3=line3;
        setColor(color);
        setFilled(filled);
    }
    public double getArea(){
        double s =(line1+line2+line3)/2;
        return Math.pow(s*(s-line1)*(s-line2)*(s-line3),0.5);
    }
    public double getPerimeter(){
        return line1+line2+line3;
    }
}

