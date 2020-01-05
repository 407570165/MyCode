package Collection.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestCollection {
    public static void main(String[] args) {
        ArrayList<String> collection1 =new ArrayList<>();
        collection1.add("Atlanta");
        collection1.add("b");
        collection1.add("c");
        collection1.add("d");
        System.out.println("all String");
        System.out.println(collection1);
        System.out.println("is d in array"+collection1.contains("d"));
        collection1.remove("b");
        System.out.println("size:"+collection1.size());
        Collection<String> collection2 =new ArrayList<>();
        collection2.add("Seattle");
        collection2.add("Portland");
        collection2.add("Los Angeles");
        collection2.add("Atlanta");
        System.out.println("all String in collection");
        System.out.println(collection2);
        ArrayList<String> c1 =(ArrayList<String>)(collection1.clone());
        c1.addAll(collection2);
        System.out.println("combine result");
        System.out.println(c1);
        c1=(ArrayList<String>)(collection1.clone());
        c1.retainAll(collection2);
        System.out.println("which is cover");
        System.out.println(c1);
        c1=(ArrayList<String>)(collection1.clone());
        c1.removeAll(collection2);
        System.out.println(c1);

    }
}
