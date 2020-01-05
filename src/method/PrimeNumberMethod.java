package method;

public class PrimeNumberMethod {
    public static void main(String[] args) {
        printPrimeNumber(50);
    }
    public static boolean isPrime(int number){
        for (int i =2;i<=number/2;i++){
            if (number%i==0){
                return false;
            }
        }
        return true;
    }
    public static void printPrimeNumber(int printNumber){
        final int THE_LENGHT_OF_LINE =10;
        int count =0;
        int number =2;
        while (count<printNumber){
            if (isPrime(number)){
                count++;
                if (count%10==1){
                    System.out.print(number);
                }
                else
                    System.out.print(" "+number);
                if (count%THE_LENGHT_OF_LINE==0){
                    System.out.println("");
                }
            }
            number++;
        }
    }
}
