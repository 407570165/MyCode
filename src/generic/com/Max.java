package generic.com;

public class Max {
    /*public static Comparable max (Comparable o1,Comparable o2){
        if (o1.compareTo(o2)>0){
            return 01;
        }
        return o2;
    }*/
    //using generic
    public static <E extends Comparable> E max(E o1,E o2){
         if (o1.compareTo(o2)>0)
             return o1;
         else
             return o2;
    }
}
