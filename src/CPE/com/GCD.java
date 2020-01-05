package CPE.com;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int row =0;
        int column =0;
        row =scanner.nextInt();
        column =scanner.nextInt();
        int matrix[][]=new int[row][column];
        for (int i =0;i<row;i++){
            for (int j =0;j<column;j++){
                matrix[i][j]=scanner.nextInt();
            }
        }
        for (int i =0;i<row;i++){
            for (int j =0;j<column;j++){
                if (j==0) {
                    System.out.print(matrix[i][j]);
                }else
                    System.out.print(" "+matrix[i][j]);
            }
            System.out.println("");
        }
    }


    /*public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int num =0;
        while((num=scanner.nextInt())!=0){
            int ans=0;
            for(int i=1;i<num;i++){
                for(int j=i+1;j<=num;j++){
                    ans+=GCD(i,j);
                }
            }
            System.out.println(ans);
        }
    }
    public static int GCD(int a,int b){
        int max=0;
        for (int i=1;i<=b;i++){
            if (a%i==0&&b%i==0){
                max=i;
            }
        }
        return max;
    }*/
}
