package practice.com;

import java.util.ArrayList;
import java.util.Scanner;

public class PracticeTestGeneric {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Integer data[]={new Integer(2),new Integer(5),new Integer(1)};
        sort(data);
        for (Integer integer:data){
            System.out.println(integer);
        }
    }
    public static <E extends Comparable<E>> void sort(E[] list){
        E currentMin;
        int currentMinIndex;
        for (int i =0;i<list.length;i++){
            currentMin =list[i];
            currentMinIndex=i;
            for (int j =i+1;j<list.length;j++){
                if (currentMin.compareTo(list[j])>0){
                    currentMin=list[j];
                    currentMinIndex=j;
                }
            }
            if(currentMinIndex!=i){
                list[currentMinIndex]=list[i];
                list[i]=currentMin;
            }
        }
    }
}
