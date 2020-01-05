package slide.com;

public class SimpleGeometricObject {
    private String color="white";
    private boolean filled;
    public  SimpleGeometricObject(){
    }
    public SimpleGeometricObject(String color,boolean filled){
        this.color =color ;
        this.filled =filled;
    }
    public String getColor (){
        return color;
    }
    public void setColor(String color){
        this.color =color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled =filled;
    }
    public String toString(){
        return color+"\n"+filled;
    }
}
