package baby.com;

import java.util.Scanner;

public class FinalTest {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String data =scanner.nextLine();
        for (int j=data.length()-1;j>=0;j--)
            System.out.print(data.charAt(j));
    }

}
