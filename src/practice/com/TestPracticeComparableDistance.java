package practice.com;

import java.util.*;

public class TestPracticeComparableDistance {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        List<PracticeLine> array =new ArrayList();
        array.add(new PracticeLine(5,8));
        array.add(new PracticeLine(9,7));
        array.add(new PracticeLine(scanner.nextDouble(),scanner.nextDouble()));
        Collections.sort(array,new LineComparator());
        System.out.println(array);
    }
   /* public static Comparable max(PracticeLine a,PracticeLine b){
        if (a.getDistance()>b.getDistance())
            return a.getDistance();
        else
            return b.getDistance();
    }*/
}
class LineComparator implements Comparator<PracticeLine> {


    @Override
    public int compare(PracticeLine o1, PracticeLine o2) {
        if (o1.getDistance()>o2.getDistance())
            return 1;
        else if (o1.getDistance()==o2.getDistance())
            return 0;
        else
            return -1;
    }
}
 class PracticeLine{
    double x;
    double y;
    PracticeLine(){

    }
    PracticeLine(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double getDistance(){
        double distance;
        distance =Math.pow((x*x)+(y*y),0.5);
        return distance;
    }
    public String toString(){
        return x+" "+y+" "+getDistance();
    }

}
