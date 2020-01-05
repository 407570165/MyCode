package baby.com;

import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int i,j;
        System.out.println("enter");
        i=scanner.nextInt();
        for (int k =0;k<i-1;k++){
            System.out.print("B");
        }
        System.out.print("A");
    }
    /*public static void printStar(int num){
        if (num==1)
            System.out.print("A");
        else {
            System.out.print("B");
            printStar(num-1);
        }
    }*/
}
