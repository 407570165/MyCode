package practice.com;

import java.util.Scanner;
import java.util.StringTokenizer;

public class PracticeTestToken {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String a =scanner.next();
        String b[] =new String[10];
        String num="";
        for (int i =0;i<a.length();i++) {
            String n = String.valueOf(a.charAt(i));
            if (isNum(n)) {
                num += n;
                if (i==a.length()-1)
                    System.out.println(num);
            }
            else {
                System.out.println(num);
                num="";
            }
        }
    }
    static boolean isNum(String s){
        try {
            Integer.parseInt(s);
            return true;
        }catch (Exception e) {
            return false;
        }
    }
}
