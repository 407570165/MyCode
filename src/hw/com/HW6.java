package hw.com;

import java.util.*;

//要怎麼定義array裡面的數字型態 要怎麼用sort排序
public class HW6 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int size=0;
        String a =scanner.nextLine();
        if (a.equals("String")){
            size=scanner.nextInt();
            String[] strings =new String[size];
            for (int i =0;i<size;i++)
                strings[i]=scanner.next();
            Arrays.sort(strings);
            String target =scanner.next();
            if(binarySearch(strings,target) == -1)
                System.out.println("Not found.");
            else
                System.out.println(target+" is found in the "+binarySearch(strings,target)+"'th place.");
        }else if (a.equals("Integer")){
            size =scanner.nextInt();
            Integer[] ints =new Integer[size];
            for (int i =0;i<size;i++)
                ints[i]=scanner.nextInt();
            Arrays.sort(ints);
            int target =scanner.nextInt();
            if (binarySearch(ints,target)==-1)
                System.out.println("Not found.");
            else
                System.out.println(target+" is found in the "+binarySearch(ints,target)+"'th place.");
        }else if (a.equals("Double")){
            size =scanner.nextInt();
            Double[] doubles =new Double[size];
            for (int i =0;i<size;i++)
                doubles[i] =scanner.nextDouble();
            Arrays.sort(doubles);
            double target =scanner.nextDouble();

            if (binarySearch(doubles,target)==-1)
                System.out.println("Not found.");
            else
                System.out.printf("%.3f",target);
                System.out.println(" is found in the "+binarySearch(doubles,target)+"'th place.");
        }else{
            size =scanner.nextInt();
            Character[] characters =new Character[size];
            for (int i =0;i<size;i++)
                characters[i]=scanner.next().charAt(0);
            Arrays.sort(characters);
            char target =scanner.next().charAt(0);
            if (binarySearch(characters,target)==-1)
                System.out.println("Not found.");
            else
                System.out.println(target+" is found in the "+binarySearch(characters,target)+"'th place.");
        }
    }
    public static <E extends Comparable<E>> int binarySearch(E[] list ,E key){
        int l =0;
        int r =list.length-1;
        int m;
        while (l!=r){
            m =(l+r)/2;
            if (list[m].compareTo(key)<0)
                l=m+1;
            else if (list[m].compareTo(key)==0)
                return m;
            else
                r=m;
        }
        if (list[l]!=key)
            return -1;
        else
            return l;
    }
}
