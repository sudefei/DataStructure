package com.array;

import java.util.ArrayList;

public class ArrayTraverse {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

    }

        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        public  ArrayList<Integer> printListFromTailToHead02(ListNode listNode) {
            if(listNode!=null){
                this.printListFromTailToHead02(listNode.next);
                arrayList.add(listNode.val);
            }
            return arrayList;
        }

}
