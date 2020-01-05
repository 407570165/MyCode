package method;

import java.math.BigInteger;

public class NumberMethod {
    public static void main(String[] args) {
        Print(20);
    }
    public static boolean isPalindrome(int number){
        String stringNumber =number+"";
        //char[] data =new char[stringNumber.length()];
        int high =stringNumber.length()-1;
        int low =0;
        while (high>low){
            if (stringNumber.charAt(high)!=stringNumber.charAt(low)){
                return false;
            }
            high--;
            low++;
        }
        return true;
    }
    public static boolean isPrime(int number){
        BigInteger bi =new BigInteger(String.valueOf(number));
        if (bi.isProbablePrime(number)){
            return true;
        }
        else
        return false;
    }
    public static void Print(int printNumber){
        final int LENGTH=10;
        int count =0;
        int number=2;
        while (count<printNumber){
            if (isPalindrome(number)&&isPrime(number)){
                count++;
                if (count%10==1){
                    System.out.print(number);
                }
                else
                    System.out.print(" "+number);
                if (count%LENGTH==0){
                    System.out.println("");
                }
            }
            number++;
        }
    }
}
