package Test.com;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String target = scanner.nextLine();
            try {
                System.out.println(Bin2Dec(target));
            } catch (MyNumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public static int Bin2Dec(String a) throws MyNumberFormatException{
        int sum =0;
        int b =0;
        for (int i=a.length()-1;i>=0;i--){
            if (a.charAt(i)=='1'||a.charAt(i)=='0'){
                if (a.charAt(i)=='1') {
                    sum += Math.pow(2, b);
                }else {
                }
                b++;
            }else {
                throw new MyNumberFormatException();
            }
        }
        return sum;
    }
}
class MyNumberFormatException extends Exception{
    MyNumberFormatException(){
        super("Incorrect Binary Format");
    }
}