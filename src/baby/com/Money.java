package baby.com;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Money {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String s;
        System.out.println("輸入一串數字並且用逗號隔開");
        s=scanner.next();
        ArrayList list =new ArrayList();
        int i =0;
        String c =s.replace(",","");
        while (i<=c.length()-1){
            list.add(c.charAt(i));
            i++;
        }
        int data[] =new int[c.length()];
        int a =0;
        System.out.println("輸入目標總數");
        int target =scanner.nextInt();
            for (int j =0;j<c.length();j++){
                for (int k =j+1;k<c.length();k++){
                    if (Integer.parseInt(String.valueOf(c.charAt(j)))+Integer.parseInt(String.valueOf(c.charAt(k)))==target){
                        data[a]=Integer.parseInt(String.valueOf(c.charAt(j)));
                        a++;
                        data[a]=Integer.parseInt(String.valueOf(c.charAt(k)));
                        a++;
                    }
                }
            }
        int f=1;
        boolean isTrue =true;
        try {
            do {
                if (isTrue) {
                    System.out.print(data[f - 1] + "," + data[f]);
                    isTrue = false;
                } else {
                    f = f * 2;
                    System.out.print(" " + data[f] + "," + data[f + 1]);
                }
            } while (data[f + 1] != 0);
        }catch (Exception ex){
            System.out.print("");
        }
    }
}
