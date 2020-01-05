package generic.com;

import interfacecom.Circle;
import interfacecom.GeometricObject;
import interfacecom.Triangle;

public class BoundTypeDemo {
    public static void main(String[] args) {
        GeometricObject object1= new Triangle(4,5);
        GeometricObject object2 =new Circle(2);
        System.out.println(equalArea(object1,object2));

    }
    public static <E extends GeometricObject> boolean equalArea(E object1,E object2){
        return object1.getArea()==object2.getArea();
    }
}
