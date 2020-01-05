package baby.com;

import java.util.Scanner;

public class Number3 {
    public static void main(String[] args) {
       Scanner scanner =new Scanner(System.in);
       int data[] =new int[10];
       for (int i = 0;i<10;i++){
           data[i]=scanner.nextInt();
       }
        System.out.println(compare(data));
    }
    public static int compare(int[] list){
        int min =list[0];
        for (int i =0;i<list.length;i++){
            if (min>list[i])
                min=list[i];
        }
        return min;
    }
}
