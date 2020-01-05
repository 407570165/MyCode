package interfacecom;

public class Triangle extends GeometricObject {
    private double weight;
    private  double height;
    public Triangle(){

    }
    public Triangle(double weight,double height){
        this.height =height;
        this.weight=weight;
    }
    public double getArea() {
        return  weight*height;
    }

    public double getPerimeter() {
        return 2*(weight*height);
    }
    public double getWeight(){
        return weight;
    }
    public double getHeight(){
        return height;
    }
    public String toString(){
        return "Area: "+getArea();
    }
}
