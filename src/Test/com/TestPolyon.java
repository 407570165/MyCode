package Test.com;

import java.util.Scanner;

public class TestPolyon {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int c=0;
        while (scanner.hasNext()){
        int count =scanner.nextInt();
        double x[]=new double[count];
        double y[]=new double[count];
        int a=0;
        int b=0;
        int i =0;
        double temp =0;
        for (int j =0;j<count*2;j++){
            if (j%2==0) {
                x[a] = scanner.nextDouble();
                a++;
            }
            else {
                y[b] = scanner.nextDouble();
                b++;
            }
        }
        for (i =0;i<count-1;i++){
            temp+=(x[i]-x[i+1])*(y[i]+y[i+1]);
        }
        temp+=(x[i]-x[0])*(y[i]+y[0]);
        temp =temp/2;
        String answer =String.format("%.3f",temp);
        if (c==0) {
            System.out.println(answer);
            c++;
        }else {
            System.out.println("");
            System.out.println(answer);
        }
        }
    }
}
