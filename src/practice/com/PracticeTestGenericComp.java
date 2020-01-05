package practice.com;

import interfacecom.Circle;
import interfacecom.GeometricObject;
import interfacecom.Triangle;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class PracticeTestGenericComp {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        ArrayList<Integer> integers =new ArrayList<>();
        for (int i =0;i<5;i++){
            integers.add(scanner.nextInt());
        }
        System.out.println(max(integers));
    }
    public static <E extends Comparable<E>> E max (ArrayList<E> list){
        E currentMin=null;
        currentMin=list.get(0);
        for (int i =1;i<list.size();i++){
         if (currentMin.compareTo(list.get(i))<0)
             currentMin=list.get(i);
        }
        return currentMin;
    }
}
