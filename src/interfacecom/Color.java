package interfacecom;

public class Color extends GeometricObject {
    private double radius;
    public Color(double radius){
        this.radius =radius;
    }
    public void setRadius(double newRadius){
        radius=newRadius;
    }
    public double getPerimeter(){
        return 2*radius;
    }
    public double getArea(){
        return  radius*radius*Math.PI;
    }
}
