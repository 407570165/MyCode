package Test.com;

import javax.sound.sampled.Line;
import java.util.*;

public class TestVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            Vector<Integer> vector = new Vector<>();
            while (scanner.hasNext()) {
                int tmp = scanner.nextInt();
                if (tmp == 0)
                    break;
                vector.add(tmp);
            }
            vector.sort(new line());//跟collection.sort 一樣
            ArrayDeque<Integer> array = new ArrayDeque<>();
            for (int i = 0; i < vector.size(); i++) {
                if (vector.elementAt(i) % 2 == 0) {
                    array.addLast(vector.elementAt(i));
                } else
                    array.addFirst(vector.elementAt(i));
            }
            boolean isFirst = true;
            for (Integer arrayDeque : array) {
                if (isFirst) {
                    System.out.print(arrayDeque);
                    isFirst = false;
                } else
                    System.out.print(" " + arrayDeque);
            }
            System.out.println("");
        }
    }
    public static <E extends Comparator<Integer>> E max(E o1,E o2,Comparator c){
        if (c.compare(o1,o2)>0)
            return o1;
        else
            return o2;
    }
}

class line implements Comparator<Integer>{

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
