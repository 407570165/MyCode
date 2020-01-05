package CPE.com;

import java.util.Scanner;

public class DaysAlgorithm {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int cases =scanner.nextInt();
        for (int i =0;i<cases;i++){
            int month[]= {31,28,31,30,31,30,31,31,30,31,30,31};
            String week[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
            int M =scanner.nextInt();
            int D =scanner.nextInt();
            D=D+4;
            for (int j=1;j<M;j++){
                D=D+month[j-1];
            }
            System.out.println(week[D%7]);
        }
    }
}
