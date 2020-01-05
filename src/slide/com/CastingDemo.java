package slide.com;

public class CastingDemo {
    public static void main(String[] args) {
        Object o =new Object();
        displayObject(o);
    }
    public static void displayObject(Object object){
        if (object instanceof CircleFromSimpleGeometricObject){
            System.out.println(((CircleFromSimpleGeometricObject) object).getArea());
        }
        if (object instanceof RectangleFromSimpleGeometricObjects){
            System.out.println(((RectangleFromSimpleGeometricObjects) object).getArea());
        }
    }
}
