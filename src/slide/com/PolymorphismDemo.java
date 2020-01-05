package slide.com;

public class PolymorphismDemo {
    public static void main(String[] args) {
        displayObjects(new CircleFromSimpleGeometricObject(1,"red",true));
        displayObjects(new RectangleFromSimpleGeometricObjects(3,5,"red",true));
    }
    public static void displayObjects(SimpleGeometricObject objects){
        System.out.println(objects.getColor());
    }
}
