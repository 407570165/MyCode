package interfacecom;

import java.util.Arrays;

public class SortRectangles {
    public static void main(String[] args) {
        ComparableRectangle[] comparableRectangle ={
                new ComparableRectangle(3.4, 5.4),
                new ComparableRectangle(13.24, 55.4),
                new ComparableRectangle(7.4, 35.4),
                new ComparableRectangle(1.4, 25.4)
        };
        Arrays.sort(comparableRectangle);
        for (ComparableRectangle compare:comparableRectangle)
            System.out.println(compare);
    }
}
