package baby.com;

import interfacecom.Circle;
import interfacecom.GeometricObject;
import interfacecom.Triangle;

import java.util.ArrayList;

public class TestTest {
    public static void main(String[] args) {
        GeometricObject g1 =new Triangle(3,5);
        GeometricObject g2 =new Triangle(5,6);
        GeometricObject g3 =new Circle(5);
        GeometricObject g4 =new Circle(6);
        ArrayList<GeometricObject> array =new ArrayList<>();
        array.add(g1);
        array.add(g2);
        array.add(g3);
        array.add(g4);
        System.out.println(max(array));
        array.sort(new Comp());
        System.out.println(array);
    }
   /* public static GeometricObject max(GeometricObject object1, GeometricObject object2,Comparator c){
        if (c.compare(object1,object2)>0)
            return object1;
        else
            return object2;
    }*/
    public static <E extends Comparable> double max(ArrayList<GeometricObject> list){
        double max = list.get(0).getArea();
        for (int i =1;i<list.size();i++){
            if (max<(list.get(i).getArea())){
                max=list.get(i).getArea();
            }
        }
        return max;
    }
}
