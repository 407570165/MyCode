package CPE.com;

import java.util.Scanner;

public class SymmetricMatrix {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int count =scanner.nextInt();
        boolean isTrue = true;
        int j =1;
        while (count>0){
            int size =scanner.nextInt();
            int data[] =new int[size*size];
            for (int i =0;i<size*size;i++){
                data[i]=scanner.nextInt();
            }
            int high =size*size-1;
            int low =0;
            while (high>low){
                if (data[high]!=data[low]){
                    isTrue=false;
                    break;
                }high--;
                low++;
            }
            if (isTrue)
                System.out.println("Test #"+j+": Symmetric");
            else
                System.out.println("Test #"+j+": Non-Symmetric");
            count--;
            j++;
        }
    }
}
