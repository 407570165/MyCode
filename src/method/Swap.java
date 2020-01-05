package method;

public class Swap {
    public static void swap(int num1,int num2){
        int temp=0;
        temp =num1;
        num1=num2;
        num2 =temp;
        System.out.println(num1+" "+num2);
    }

    public static void main(String[] args) {
        int num1 =5;
        int num2 =8;
        swap(num1,num2);
    }
}
