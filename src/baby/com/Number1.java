package baby.com;
import java.util.Scanner;
public class Number1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int odd[] =new int[20];
        int even[] =new int[20];
        int i =0;//for even
        int j =0;//for odd
        int data=0;
        int sum_even=0;
        int sum_odd=0;
        int initial =scanner.nextInt();
        String decide="";
        if (initial%2==0){
            even[i]=initial;
            i++;
            sum_even+=initial;
        }else {
            odd[j]=initial;
            j++;
            sum_odd+=initial;
        }
        do {
            System.out.println("please enter Y or y");
            decide =scanner.next();
            if (decide.equals("y"))
                break;
            else
                data =scanner.nextInt();
                if (data%2==0){
                    even[i] =data;
                    i++;
                    sum_even+=data;
                }else {
                    odd[j]=data;
                    j++;
                    sum_odd+=data;}
        }while (decide.equals("Y"));
        System.out.println("even: "+sum_even);
        System.out.println("odd: "+sum_odd);}}