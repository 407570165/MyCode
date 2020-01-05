package slide.com;

public class RectangleFromSimpleGeometricObjects extends SimpleGeometricObject{
    private double width;
    private double height;
    public RectangleFromSimpleGeometricObjects(double width,double height){
        super("white",true);
        this.width=width;
        this.height =height;
    }
    public RectangleFromSimpleGeometricObjects(double height,double width,String color,boolean filled){
        this.width=width;
        this.height=height;
        setColor(color);
        setFilled(filled);
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public double getArea(){
        return height*width;
    }
    public double getPerimeter(){
        return 2*(height+width);
    }
}
