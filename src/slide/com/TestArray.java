package slide.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestArray {
    public static void main(String[] args) {
            Integer [] array ={3,5,95,4,15,343,6,5};
            ArrayList<Integer> list =new ArrayList<>(Arrays.asList(array));
            Collections.shuffle(list);
        System.out.println(list);
    }
}
