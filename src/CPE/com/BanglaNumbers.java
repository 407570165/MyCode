package CPE.com;

import java.util.Scanner;

public class BanglaNumbers {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int count=1;
        while (scanner.hasNext()){
            System.out.printf("%4d.",count);
            int a=scanner.nextInt();
            if (a==0){
                System.out.print(" 0");
            }else {
                change(a);
            }

        count++;
        System.out.println("");
        }
}
        public static void change(int a){
        if (a>=10000000){
            change(a/10000000);
            System.out.print(" kuti");
            a=a%10000000;
        }
        if (a>=100000){
            change(a/100000);
            System.out.print(" lakh");
            a=a%100000;
        }
        if (a>=1000){
            change(a/1000);
            System.out.print(" hajar");
            a=a%1000;
        }
        if (a>=100){
            change(a/100);
            System.out.print(" shata");
            a=a%100;
        }
        if (a>0){
            System.out.print(" "+a);
        }
        }
    }

