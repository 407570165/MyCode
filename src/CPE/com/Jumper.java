package CPE.com;

import java.util.Arrays;
import java.util.Scanner;

public class Jumper {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        while (scanner.hasNextLine()){
            int cases =scanner.nextInt();
            boolean flag =true;
            int arrys[] =new int[cases];
                for (int i =0;i<cases;i++){
                    arrys[i]=scanner.nextInt();
                }
                if (cases!=1){
                    int arrD [] =new int[cases-1];
                    for (int i =0;i<arrys.length-1;i++){
                        arrD[i]=Math.abs(arrys[i]-arrys[i+1]);
                    }
                    Arrays.sort(arrD);
                    for (int i =0;i<arrD.length;i++){
                        if (arrD[i]!=i+1){
                            flag =false;
                            break;
                        }
                    }
                }
                if (flag)
                    System.out.println("Jolly");
                else
            System.out.println("Not Jolly");
        }
    }
}
