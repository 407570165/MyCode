package Object;

public class PrivateStaticMembers {
    private static int numberOfObjects;
    double radius;
   public PrivateStaticMembers(){
        numberOfObjects++;
    }
    public PrivateStaticMembers(double newRadius){
        radius=newRadius;
        numberOfObjects++;
    }
    public static double getNumberOfObjects(){
        return numberOfObjects;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double newRadius){
        radius=newRadius;
    }
}
