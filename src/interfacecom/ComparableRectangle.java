package interfacecom;

public class ComparableRectangle extends Triangle implements Comparable<ComparableRectangle> {
    public ComparableRectangle(double weight,double height) {
        super(weight,height);
    }
    @Override
    public int compareTo(ComparableRectangle o) {
        if (getArea()>o.getArea())
            return  1;
        if (getArea()<o.getArea())
            return -1;
        else
            return 0;
    }
    public String toString(){
        return getArea()+" "+getHeight()+" "+getWeight();
    }
}
