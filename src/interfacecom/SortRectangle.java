package interfacecom;

import java.awt.*;
import java.util.Arrays;

public class SortRectangle {
    public static void main(String[] args) {
        ComparableRectangle compare[]={
                new ComparableRectangle(3.4,3.5),
                new ComparableRectangle(13.24,55.4),
                new ComparableRectangle(7.4,35.4),
                new ComparableRectangle(1.4,25.4)
        };
        //Arrays.sort(compare);
        for (Triangle rectangle:compare){
            System.out.println(rectangle+" ");
        }
    }
}
