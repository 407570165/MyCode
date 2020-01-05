package Collection.com;

import interfacecom.Circle;
import interfacecom.GeometricObject;
import interfacecom.Triangle;

import java.util.*;

public class TestComparator {
    public static void main(String[] args) {
        GeometricObject object1 =new Triangle(5,5);
        GeometricObject object2 =new Circle(5);
        GeometricObject object3 =new Triangle(4,5);
        GeometricObject g=max(object1,object2,new GeometricComparator());
        System.out.println("the max is: "+g);
        List<GeometricObject> list =new ArrayList<>();
        list.add(object1);
        list.add(object2);
        list.add(object3);
        list.sort(new GeometricComparator());
        System.out.println(list);
    }
    public static GeometricObject max (GeometricObject object1, GeometricObject object2, Comparator c){
        if (c.compare(object1,object2)>0)
            return object1;
        else
            return object2;
    }
}
