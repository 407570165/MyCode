package Object;

public class StaticMembers {
    double radius ;
    static int numberOfObjects=0;
    StaticMembers(){
            radius =1.0;
            numberOfObjects++;
    }
    StaticMembers(int newRadius){
        radius =newRadius;
        numberOfObjects++;
    }
   static int getNumberOfObjects(){
        return numberOfObjects;
    }
}
