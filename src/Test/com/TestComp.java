package Test.com;

import java.util.*;

public class TestComp {
    public static void main(String[] args) {
    List<Integer> data= new ArrayList<>();
    data.add(1);
    data.add(10);
    data.add(11);
    data.add(0);
    data.sort(new NumberComparator());
    System.out.println(data);

    }
}
class NumberComparator implements Comparator<Integer>{

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
