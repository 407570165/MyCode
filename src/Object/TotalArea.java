package Object;

import java.util.Random;

public class TotalArea {
    public static void main(String[] args) {
        PrivateStaticMembers[] circleArray;
        circleArray =createCircleArray();
        printCircleArray(circleArray);
    }
    public static PrivateStaticMembers[] createCircleArray(){
        PrivateStaticMembers[] circleArray=new PrivateStaticMembers[5];
        for (int i =0;i<circleArray.length;i++){
            circleArray[i]=new PrivateStaticMembers(Math.random()*100);
        }
        return circleArray;
    }
    public static void printCircleArray(PrivateStaticMembers[] circleArray){
        System.out.printf("%-30s%-15s\n","Radius","Area");
        for (int i=0;i<circleArray.length;i++){
            System.out.printf("%-30f%-15f\n",circleArray[i].getRadius(),circleArray[i].getArea());
        }
        System.out.println("--------------------------------");
        System.out.printf("%-30s%-15f","The total area is: ",sum(circleArray));
    }
    public static double sum(PrivateStaticMembers[] circleArray){
        double sum=0 ;
        for (int i =0;i<circleArray.length;i++){
            sum+=circleArray[i].getArea();
        }
        return sum;
    }
}
