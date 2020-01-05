package Exception;

public class InvalidRadiusException extends Exception {
    private  double radius;
    public InvalidRadiusException (double radius){
        super("radius"+radius);
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
}
