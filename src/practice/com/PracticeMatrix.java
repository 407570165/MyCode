package practice.com;

import java.util.Scanner;

public class PracticeMatrix {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int count =scanner.nextInt();
        while (count>0){
            int rowA =scanner.nextInt();
            int columnA =scanner.nextInt();
            int matrixA[][] =new int[rowA][columnA];
            for (int i=0;i<rowA;i++){
                for (int j =0;j<columnA;j++){
                    matrixA[i][j]=scanner.nextInt();
                }
            }
            int rowB=scanner.nextInt();
            int columnB=scanner.nextInt();
            int matrixB[][] =new int[rowB][columnB];
            for (int i =0;i<rowB;i++){
                for(int j =0;j<columnB;j++){
                    matrixB[i][j]=scanner.nextInt();
                }
            }
            int matrixC[][] =new int[rowA][columnB];
            int sum =0;
            int result= 0;
            for (int i =0;i<rowA;i++) {
                for (int j = 0; j < columnB; j++) {
                    for (int k = 0; k < columnA; k++) {
                        sum=matrixA[i][k]*matrixB[k][j];
                        result+=sum;
                    }
                    matrixC[i][j]=result;
                    result=0;
                }
            }
            for (int i =0;i<rowA;i++){
                int a= 0;
                for (int j =0;j<columnB;j++){
                    if (a==0){
                        System.out.print(matrixC[i][j]);
                        a++;
                    }
                    else
                        System.out.print(" "+matrixC[i][j]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
