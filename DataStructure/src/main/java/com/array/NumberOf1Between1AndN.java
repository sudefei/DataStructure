package com.array;

import java.util.*;

public class NumberOf1Between1AndN {
    public static void main(String[] args) {
        System.out.println(count(13));
        int[] arr={1,9,5,10,3,4};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.binarySearch(arr,5);
        System.out.println(arr);
    }

    public static int count(int n) {
        int count = 0;
        /**
         * String ,StringBuffer , StringBuilder 之间的区别
         * String 的长度是不可变的，每次进行字符串的拼接时会生成新的字符串，浪费资源
         * StringBuffer 长度和内容是可变的，有缓存区，不浪费资源
         *              数据安全 ，有synchronized 修饰，效率低
         * StringBuilder 长度和内容是可变的，有缓存区，不浪费资源
         *              数据不安全感，效利高
         */
        StringBuffer stringBuffer= new StringBuffer();
        for (int i=0;i<n+1;i++){
            stringBuffer.append(i);
        }
        for (int i=0;i<stringBuffer.length();i++){
            if (stringBuffer.charAt(i) == '1'){
                count ++;
            }
        }
        return count;
    }

}