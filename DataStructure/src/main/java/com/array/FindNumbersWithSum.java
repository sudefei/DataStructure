package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class FindNumbersWithSum {
    public static void main(String[] args) {

        int[] arr={2,3,4,5,6,7,1,1,5};
        System.out.println(FindNumbersWithSum(arr,5));

    }

    /**
     *  在数组中找到和相同但是程及最小的一组数据
     *   思路： a1<=a2<=b2<=b1  当 a1+b1=a2+b2 时，则一定有 a1*b1 <= a2*b2
     * @param array
     * @param sum
     * @return
     */
    public static ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        for (int i=0; i<array.length-1;i++){
            for (int j=i+1;j<array.length;j++){
                if (array[i]+array[j] == sum){
                    arrayList.add(array[i]);
                    arrayList.add(array[j]);
                    return arrayList;
                }
            }
        }
        return arrayList;
    }
}
