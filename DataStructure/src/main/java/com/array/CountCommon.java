package com.array;

import java.util.*;

public class CountCommon {
    public static void main(String[] args) {
           int[] arr={1,2,3,2,2,1,5,4,3};
           CountCommon common=new CountCommon();
        System.out.println(common.MoreThanHalfNum_Solution(arr));
    }
    public int MoreThanHalfNum_Solution(int [] array) {
//        hashMap 中只键是唯一的，值可以重复。  如果键是重复的，值会进行覆盖
        HashMap<Integer,Integer> hashMap=new HashMap();
        int count=0;
        Hashtable<String,Integer> hashtable=new Hashtable<String, Integer>();
        int media=array.length/2;
        for (int i=0;i<array.length;i++){
            if (hashMap.containsKey(array[i])){
                count= hashMap.get(array[i]).intValue();
                hashMap.put(array[i],count++);
            }else{
                hashMap.put(array[i],1);
            }
        }
        Set<Map.Entry<Integer, Integer>> entries = hashMap.entrySet();
        for (Map.Entry<Integer, Integer> s:entries){
            while (s.getValue().intValue() >= media){
               return  s.getKey().intValue();
        }}
        /*
        Iterator iter = map.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry entry = (Map.Entry)iter.next();
            Integer key =(Integer)entry.getKey();
            Integer val = (Integer)entry.getValue();
            if(val>array.length/2){
                return key;
            }
         */
        return 0;
    }

}
