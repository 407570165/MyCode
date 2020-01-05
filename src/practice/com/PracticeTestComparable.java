package practice.com;

import interfacecom.Circle;
import interfacecom.GeometricObject;
import interfacecom.Triangle;

import java.util.ArrayList;
import java.util.List;

public class PracticeTestComparable {
    public static void main(String[] args) {
        GeometricObject objects[]={new Triangle(3, 5),
                new Triangle(3, 5),
                new Triangle(8, 2),
                new Triangle(2, 5),
                new Circle(5),
        new Triangle(10,10)};
        List<GeometricObject> list =new ArrayList<GeometricObject>();
        list.add(new Triangle(3, 5));
        list.add(new Triangle(3, 5));
        list.add(new Triangle(8, 2));
        list.add(new Triangle(10,10));
        list.add(new Circle(5));
        System.out.println(max(objects));
    }
    public static Comparable max (GeometricObject[] objects){
        double max =objects[0].getArea();
        for (int i=1;i<objects.length;i++){
            if (max<objects[i].getArea())
                max=objects[i].getArea();
        }
        return max;
    }
}
