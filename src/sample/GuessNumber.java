package sample;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random =new Random();
        String number="";
        Scanner scanner =new Scanner(System.in);
        while (number.length()<4){
            int x =random.nextInt(9);
            if (!number.contains(String.valueOf(x))){
                number +=x;
            }
        }
        String guess="";
        boolean check[] =new boolean[4];
        while (guess!=number){
            int a =0;
            int b =0;
            guess=scanner.nextLine();
            Arrays.fill(check,false);
            for (int i =0;i<4;i++){
                if (guess.charAt(i)==number.charAt(i)) {
                    a++;
                    check[i]=true;
                }
            }
            for (int i =0;i<4;i++){
                for (int j =0;j<4;j++){
                    if (!check[j]&&guess.charAt(i)==number.charAt(j)){
                        b++;
                        check[j]=true;
                        break;
                    }
                }
            }
            if (a==4){
                System.out.println("bingo"+number);
            }else
            System.out.println(a+"A"+b+"B");
        }
    }
}
