package CPE.com;

import java.util.Scanner;

public class Warriors {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int a = 0,b =0;
        while (scanner.hasNext()){
             a =scanner.nextInt();
             b =scanner.nextInt();
            int result =Math.abs(a-b);
            System.out.println(result);
        }

    }
}
