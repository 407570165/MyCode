package interfacecom;

import javafx.scene.shape.Circle;

public class TestGeometric {
    public static void main(String[] args) {
        GeometricObject a =new Color(5);
        GeometricObject b =new Triangle(5,3);
        System.out.println(equalArea(a,b));
        displayGeometricObject(a);
        displayGeometricObject(b);
    }
    public static boolean equalArea(GeometricObject object1,GeometricObject object2){
        if(object1.getArea()==object2.getArea())
            return true;
        else
            return false;
    }
    public static void displayGeometricObject(GeometricObject object){
        System.out.println();
        System.out.println(object.getArea());
        System.out.println(object.getPerimeter());
    }
}
