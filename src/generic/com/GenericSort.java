package generic.com;

public class GenericSort {
    public static void main(String[] args) {
        Integer inArray[] ={new Integer(2),new Integer(4),new Integer(3)};
        Double[] doubleArray = {
                new Double(3.4), new Double(1.3),
                new Double(-22.1) };
        Character[] charArray={new Character('a'),
        new Character('J'), new Character('r') }
    ;
        String[] stringArray = {
                "Tom", "Susan", "Kim" }
                ;
        sort(inArray);
        sort(doubleArray);
        sort(charArray);
        sort(stringArray);
        System.out.println("1: ");
        printList(inArray);
        System.out.println("2: ");
        printList(doubleArray);
        System.out.println("3: ");
        printList(charArray);
        System.out.println("4: ");
        printList(stringArray);
    }
    public static <E extends Comparable> void sort(E[] list){
        E currentMin ;
        int currentMinIndex;
        for (int i=0;i<list.length-1;i++){
            currentMin=list[i];
            currentMinIndex=i;
            for (int j =i+1;j<list.length;j++){
                if (currentMin.compareTo(list[j])>0){
                    currentMin=list[j];
                    currentMinIndex =j;
                }
            }
            if (currentMinIndex!=i){
                list[currentMinIndex]=list[i];//why i 會變成currentMinIndex裡面的值
                list[i]=currentMin;
            }
        }
    }
    public static void printList(Object[] object){
        for (int i=0;i<object.length;i++)
            System.out.print(object[i]+" ");
            System.out.println();
    }
}
