package baby.com;

public class Triger3 {
    public static void main(String[] args) {
        int data[]=new int[20];
        data[0]=1;
        for (int i =1;i<20;i++){
            data[i]=data[i-1]*2+3;
        }
        for (int j=0;j<20;j++)
            System.out.print(data[j]+" ");
    }
}