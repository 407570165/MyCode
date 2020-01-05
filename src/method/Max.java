package method;

public class Max {
    public  static int max (int num1,int num2){
        int result;
        if (num1>num2){
            result=num1;
        }
        else {
            result = num2;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(max(35,10));
        System.out.println(max(10,20));
    }
}
