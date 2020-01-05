package CPE.com;

import java.util.Scanner;

public class CarryOperations {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        while (true){
            StringBuilder st1=new StringBuilder(scanner.next());
            StringBuilder st2=new StringBuilder(scanner.next());
            if (st1.charAt(0)=='0'&&st2.charAt(0)=='0')
                break;
            st1.reverse();
            st2.reverse();
            int maxSize =Math.max(st1.length(),st2.length());
            int minSize =Math.min(st1.length(),st2.length());
            int c =0;
            int count =0;
            for (int i =0;i<maxSize;i++){
                if (i<minSize){
                    int temp =st1.charAt(i)-48+st2.charAt(i)-48+c;
                    c=temp/10;
                }else {
                    if (st1.length()==maxSize){
                        int temp =st1.charAt(i)-48+c;
                        c=temp/10;
                    }else {
                        int temp = st2.charAt(i) - 48 + c;
                        c=temp/10;
                    }
                }
                if (c!=0)
                    count++;
            }
            if (count==0){
                System.out.println("No carry operation.");
            }else if (count==1){
                System.out.println(count+" carry operation.");
            }else
                System.out.println(count+" carry operation.");
        }
    }
}
