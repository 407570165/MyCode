package practice.com;

import java.util.Scanner;

public class PracticeMatrix {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int count =0;
        count =scanner.nextInt();
        while (count>0){
            int type =scanner.nextInt();
            int row[]=new int[type*type];
            for (int i=0;i<type*type;i++){
                    row[i]=scanner.nextInt();
            }
            int low =0;
            boolean flag=true;
            int high =row.length-1;
            while (high>low){
                if (row[low]!=row[high]) {
                    flag=false;
                    break;
                }else
                    low++;
                    high--;
            }
            if (flag)
                System.out.println("yes");
            else
                System.out.println("no");
            count--;
        }
    }
}
