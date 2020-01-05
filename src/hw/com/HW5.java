package hw.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String mode =scanner.nextLine();
        if (mode.equals("Integer")){
            ArrayList<Integer> integers =new ArrayList<>();
            for (int i=0;i<10;i++){
                integers.add(scanner.nextInt());
            }
            print(integers);
        }else if (mode.equals("Double")){
            ArrayList<Double> doubles =new ArrayList<>();
            for (int i =0;i<10;i++){
                doubles.add(scanner.nextDouble());
            }
            System.out.printf("%.3f%n",min(doubles));
            System.out.printf("%.3f%n",max(doubles));
        }else if (mode.equals("Character")){
            ArrayList<String> characters =new ArrayList<>();
            for (int i =0;i<10;i++){
                characters.add(scanner.next());

            }
            print(characters);
        }else if (mode.equals("String")){
            ArrayList<String> strings =new ArrayList<>();
            for (int i=0;i<10;i++){
                strings.add(scanner.next());
            }
            print(strings);
        }
        /*ArrayList <Integer> integer =new ArrayList<>();
        integer.add(2);
        integer.add(3);
        integer.add(1);
        print(integer);*/
    }
    public static <E extends Comparable<E>> E min(ArrayList<E> list){
        E currentMin;
            currentMin =list.get(0);
            for (int i =1;i<=list.size()-1;i++){
                if (currentMin.compareTo(list.get(i))>0){
                    currentMin =list.get(i);
                }
            }
            return currentMin;
    }
    public static <E extends Comparable<E>> E max(ArrayList<E> list){
        E currentMax ;
        currentMax =list.get(0);
        for (int i =1;i<list.size();i++){
            if (currentMax.compareTo(list.get(i))<0){
                currentMax =list.get(i);
            }
        }
        return currentMax;
    }
    public static void print(ArrayList list){
        System.out.println(min(list));
        System.out.println(max(list));
    }
}
