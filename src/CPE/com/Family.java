package CPE.com;

import java.util.Arrays;
import java.util.Scanner;

public class Family {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int count =0;
        count =scanner.nextInt();
        while (count>=0){
            int time=0;
            time =scanner.nextInt();
            int arry[] =new int[time];
            for (int i =0;i<time;i++){
                arry[i]=scanner.nextInt();
            }
            Arrays.sort(arry);
            int sum =0;
            for (int i :arry)
                sum+=Math.abs(arry[time/2]-i);
            System.out.println(sum);
        }
       /* Scanner scanner =new Scanner(System.in);
        int count =0;
        count =scanner.nextInt();
        int member=0;
        scanner.nextLine();
        while (count>=0) {
            String number = scanner.nextLine();
            number = number.replace(" ", "");
            member = Integer.parseInt(String.valueOf(number.charAt(0)));
            String street[] = new String[member+1];
            for (int i = 1; i <member+1; i++) {
                street[i] = (String.valueOf(number.charAt(i)));
            }
            int result = 0;
            for (int i = 2; i<member+1; i++) {
                result = Math.abs(Integer
                        .parseInt(street[i - 1]) - Integer.parseInt(street[i]));
            }
            System.out.println(result);
            count--;
        }*/
    }
}
