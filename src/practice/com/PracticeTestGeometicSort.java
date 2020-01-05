package practice.com;

import interfacecom.Circle;
import interfacecom.GeometricObject;
import interfacecom.Triangle;

import java.util.*;

public class PracticeTestGeometicSort {
    public static void main(String[] args) {
        GeometricObject object1 =new Triangle(5,6);
        GeometricObject object2 =new Circle(5);
        GeometricObject object3 =new Circle(6);
        GeometricObject object4=new Triangle(8,5);
        System.out.println(max(object1,object2,new TestComp()));
        List<GeometricObject> list =new ArrayList<>();
        list.add(object1);
        list.add(object2);
        list.add(object3);
        list.add(object4);
        list.sort(new TestComp());
        System.out.println(list);
        LinkedList<GeometricObject> linkedList =new LinkedList(list);
        ListIterator<GeometricObject> listIterator =linkedList.listIterator();
        /*while (listIterator.hasNext())
            System.out.println(listIterator.next());*/
        listIterator=linkedList.listIterator(linkedList.size());
        while (listIterator.hasPrevious())
            System.out.println(listIterator.previous());
    }
    public static GeometricObject max(GeometricObject o1,GeometricObject o2,Comparator c){
        if (c.compare(o1,o2)>0)
            return o1;
        else
            return o2;
    }
}
class TestComp implements Comparator<GeometricObject>{
    @Override
    public int compare(GeometricObject o1, GeometricObject o2) {
        if (o1.getArea()>o2.getArea())
            return 1;
        else if (o1.getArea()==o2.getArea())
            return 0;
        else
            return -1;
    }
}
