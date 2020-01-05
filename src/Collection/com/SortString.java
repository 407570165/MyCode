package Collection.com;

import java.util.Arrays;
import java.util.Comparator;

public class SortString {
    public static void main(String[] args) {
        String[] cites ={"Atlanta","Savannah","New York","Dallas"};
        Arrays.sort(cites,new MyComparator());
        for (String s :cites)
            System.out.println(s);

    }
    public static class MyComparator implements Comparator<String>{

        @Override
        public int compare(String o1, String o2) {
            return o1.length()-o2.length();//甚麼意思
        }
    }
}
