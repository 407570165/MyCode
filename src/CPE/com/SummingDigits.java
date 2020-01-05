package CPE.com;

import java.util.Scanner;

public class SummingDigits {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        while (scanner.hasNext()){
            String st =scanner.next();
            if (st.equals("0"))
                break;
            int num =0;
            while (st.length()!=1){
                for (int i=0;i<st.length();i++){
                    num =num+Integer.parseInt(String.valueOf(st.charAt(i)));
                }
                st= String.valueOf(num);
            }
            System.out.println(num);
        }
    }
}
