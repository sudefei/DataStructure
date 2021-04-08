package com.string;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class CountEveluate {
    public static void main(String[] args) {
        String str="1*2+((3+3))))(((";
        LinkedList linkedList=new LinkedList();
        int doublecount=0;
        int leftcount=0;
        int rightcount=0;
        char[] chars = str.toCharArray();
        for (int i=0;i<chars.length;i++){
            if (chars[i] == '(' || chars[i] == ')'){
                linkedList.add(chars[i]);
            }
        }
        for (int i=0;i<linkedList.size();i++){
            if (linkedList.get(i).equals('(')) leftcount++;
            if (linkedList.get(i).equals(')')) rightcount++;
            if (i != linkedList.size()-1 && linkedList.get(i).equals( '(') && linkedList.get(i+1).equals(')' )){
                linkedList.remove(i);
                linkedList.remove(i+1);
                doublecount++;
                leftcount--;
                rightcount--;
                i=-1;
            }
            }

        System.out.println("double+"+doublecount+"left" + leftcount +"right"+ rightcount);
    }
    
}