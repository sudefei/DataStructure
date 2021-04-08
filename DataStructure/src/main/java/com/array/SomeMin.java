package com.array;

import java.util.*;

public class SomeMin{
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        initial(list);
        ListIterator listIterator = list.listIterator();
        Iterator iterator1 = list.iterator();
        listIterator.add("hello");
        foreachFirst(listIterator);
        System.out.println("************************************");
        Iterator iterator = list.iterator();

        foreachFirst(listIterator);
        System.out.println("-----------------------------------------");
        listIterator.add("Element 5");
        listIterator.add("Element 6");
        foreachLast(listIterator);
        System.out.println("-------------------------------------");

        System.out.println("-------------------------------------");

//        while (listIterator.hasPrevious()) {
//            System.out.println(listIterator.previous().toString());
//        }
//        while(listIterator.hasNext()){
//            System.out.println(listIterator.next().toString());
//        }


    }
    public static void initial(List<String> list){
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");
        list.add("Element 4");
    }
    public static void foreachFirst(ListIterator listIterator){
        while(listIterator.hasNext()){
            System.out.println(listIterator.next().toString());
        }
    }
    public static void foreachLast(ListIterator listIterator){
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous().toString());
        }
    }
}
