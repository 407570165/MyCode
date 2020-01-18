package practice.com;

import java.util.*;

public class PracticeTestSort {
    public static void main(String[] args) {
        String[] cities ={"f","b","d","c"};
        Arrays.sort(cities, new Sortings());
        List<String> list =new ArrayList<>();
        list.add("f");
        list.add("b");
        list.add("d");
        list.add("c");
        list.sort(new Sortings());
        Collections.sort(list);
        System.out.println(list);
    }
}
class Sortings implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        if (o1.compareTo(o2)>0)
            return -1;
        else if (o1.compareTo(o2)==0)
            return 0;
        else
            return 1;
    }
}
