package baby.com;

import java.util.Random;

public class Number4 {
    public static void main(String[] args) {
        Random random =new Random();
        int a=0;
        int b=0;
        int count=0;
        double calculate=1;
        int time=0;
        while(count<500){
            a=random.nextInt(6)+1;//6 是0~5 所以+1表1-6
            b=random.nextInt(6)+1;
            if (a+b==3){
                calculate=calculate*0.056;
                time++;//1 2 出現的次數
            }else {
            }
            count++;
        }
        System.out.println(time);
        System.out.printf("%.42f",calculate);
    }
}
