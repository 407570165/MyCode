package CPE.com;

import javax.print.DocFlavor;
import java.util.Scanner;

public class Say11 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        while (scanner.hasNextLine()){
            String data =scanner.nextLine();
            if (Integer.parseInt(data)==0)
                break;
            int odd=0;
            int even =0;
            for (int i =0;i<data.length();i++){
                if (i%2==0){
                    even+=Integer.parseInt(String.valueOf(data.charAt(i)));
                }else
                    odd+=Integer.parseInt(String.valueOf(data.charAt(i)));
            }
            if (Math.abs(even-odd)%11==0){
                System.out.println(data+" is a multiple of 11.");
            }else
                System.out.println(data+" is not a multiple of 11.");
        }
    }
}
