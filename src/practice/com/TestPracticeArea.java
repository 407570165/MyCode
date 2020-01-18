package practice.com;

import java.util.*;

public class TestPracticeArea {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int times =scanner.nextInt();
        List<Double> arrayList =new ArrayList();
        double answer = 0;
        while(times>0) {
            answer =0;
            int count = scanner.nextInt();
            double x[] = new double[count];
            double y[] = new double[count];
            int a = 0;
            int b = 0;
            for (int j = 0; j < count*2; j++) {
                if (j % 2 == 0) {
                    x[a] = scanner.nextDouble();
                    a++;
                } else {
                    y[b] = scanner.nextDouble();
                    b++;
                }
            }
            int i = 0;
            for (i = 0; i < count - 1; i++) {
                answer += (x[i] - x[i + 1]) * (y[i] + y[i + 1]);
            }
            answer += (x[i] - x[0]) * (y[i] + y[0]);
            answer =answer/2;
            times--;
            arrayList.add(answer);
        }
        arrayList.sort(new Sorting());
        LinkedList linkedList =new LinkedList(arrayList);
        ListIterator listIterator =linkedList.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }
}
class Sorting implements Comparator<Double>{

    @Override
    public int compare(Double o1, Double o2) {
        if (o1.compareTo(o2)>0)
            return 1;
        else if (o1.compareTo(o2)==0)
            return 0;
        else
            return -1;
    }
}
