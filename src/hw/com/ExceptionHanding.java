package hw.com;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ExceptionHanding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String ten = Dec2Hex(scanner.nextInt());
            scanner.nextLine();
            System.out.println(ten);
            int six =hex2Dec(scanner.nextLine());
            System.out.println(six);
            int six1=hex2Dec(scanner.nextLine());
            System.out.println(six1);
        }
        catch (MyNumberFormatException ne){
            System.out.println(ne.getMessage());
        }
    }

    public static String Dec2Hex(int dec) {
        String result = Integer.toHexString(dec).toUpperCase();
        return result;
    }
    public static int hex2Dec(String hexString) throws MyNumberFormatException {
        String s = "123bfffffffffffffffffffffffft";
        String regex = "^[A-Fa-f0-9]+$";
        for(int i = 0; i < hexString.length(); ++i)
        {
            char ch =hexString.charAt(i);
            if(!((ch>='A'&&ch<='F')||(ch>='0'&&ch<='9')))
            {
                throw new MyNumberFormatException();
            }
        }
        int outcome = Integer.parseInt(hexString, 16);
        return outcome;

    }
}
class MyNumberFormatException extends Exception{
         MyNumberFormatException(){
             super("String is no HEX");
        }
}




