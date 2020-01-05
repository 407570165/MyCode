package practice.com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PracticeTestCompare {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList =new ArrayList();
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(11);
        arrayList.add(20);
        arrayList.add(1);
        arrayList.sort(new Line());
        System.out.println(arrayList);
    }
}
class Line implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1.compareTo(o2)>0)
            return 1;
        else if (o1.compareTo(o2)==0)
            return 0;
        else
            return -1;
    }
}
