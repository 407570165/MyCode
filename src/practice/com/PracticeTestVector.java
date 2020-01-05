package practice.com;

import java.util.*;

public class PracticeTestVector {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        while (scanner.hasNext()) {
            Vector<Integer> vector = new Vector();
            while (scanner.hasNext()) {
                int temp=scanner.nextInt();
                if (temp==0)
                    break;
                else
                    vector.add(temp);
            }
            vector.sort(new TestLine());
            ArrayDeque<Integer> array = new ArrayDeque<>();
            for (int i = 0; i < vector.size(); i++) {
                if (vector.elementAt(i) % 2 == 0)
                    array.addLast(vector.elementAt(i));
                else
                    array.addFirst(vector.elementAt(i));
            }
            int a =0;
            for (Integer arrayDeque:array){
                if (a==0) {
                    System.out.print(arrayDeque);
                    a++;
                }else
                    System.out.print(" "+arrayDeque);
            }
            System.out.println("");
            for (int i =0;i<array.size();i++){
                array.removeFirst();
            }
        }
    }
}
class TestLine implements Comparator<Integer> {

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
