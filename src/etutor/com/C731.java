package etutor.com;

import java.util.Arrays;
import java.util.Scanner;

public class C731 {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int a =scanner.nextInt();
        int arrayA[] =new int[a];
        for (int i=0;i<arrayA.length;i++)
            arrayA[i]=scanner.nextInt();
        int b =scanner.nextInt();
        int arrayB[] =new int[b];
        for (int i =0;i<arrayB.length;i++)
            arrayB[i]=scanner.nextInt();
        for (int ints:merge(arrayA,arrayB)) {//怎麼印第一個
            if (ints == 1)
                System.out.print(ints);
            else
            System.out.print(" " + ints);
        }
        System.out.println();
    }
    public static int[] merge(int[] list1,int[] list2){
        int length =list1.length+list2.length;
        int result[]=new int[length];
        int count =0;
        while (count<length){
            if (count<list1.length) {
                for (int i = 0; i < list1.length; i++) {
                    result[count] = list1[i];
                    count++;
                }
            }else
            for (int i =0;i<list2.length;i++){
                result[count]=list2[i];
                count++;
            }
        }
        Arrays.sort(result);
        return result;
    }
}
