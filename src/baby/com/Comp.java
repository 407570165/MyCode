package baby.com;

import interfacecom.GeometricObject;

import java.util.Comparator;

public class Comp implements Comparator<GeometricObject> {

    @Override
    public int compare(GeometricObject o1, GeometricObject o2) {
        double a1 =o1.getArea();
        double a2 =o2.getArea();
        if (a1>a2)
            return 1;
        else if (a1<a2)
            return -1;
        else
            return 0;
    }
}
