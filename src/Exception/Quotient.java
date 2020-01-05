package Exception;

import java.util.Scanner;

public class Quotient {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try {
            int a =scanner.nextInt();
            int b =scanner.nextInt();
            QuotientFormat(a,b);
        }catch (ArithmeticException ae){
            System.out.println("");
        }

    }
    public static void QuotientFormat(int a,int b){
        if (b==0){
            throw new ArithmeticException("wrong");
        }else
            System.out.println(a/b);
    }
}
