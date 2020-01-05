package Collection.com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class TestArrrayAndLinkedList {
    public static void main(String[] args) {
        List arrayList =new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(0, 10);
        arrayList.add(3, 30);
        System.out.println(arrayList);
        LinkedList linkedList =new LinkedList(arrayList);
        linkedList.add(1,"red");
        linkedList.removeLast();
        linkedList.addFirst("green");
        System.out.println("display: ");
        ListIterator listIterator =linkedList.listIterator();
        while (listIterator.hasNext()){
            System.out.print(listIterator.next()+" ");
        }
        System.out.println();
        System.out.println("backward");
        listIterator =linkedList.listIterator(linkedList.size());//這是幹嘛的
        while (listIterator.hasPrevious()){
            System.out.print(listIterator.previous()+" ");
        }
    }
}
