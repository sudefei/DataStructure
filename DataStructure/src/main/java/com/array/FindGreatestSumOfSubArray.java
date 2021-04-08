package com.array;

import java.util.ArrayList;

public class FindGreatestSumOfSubArray {
    public static void main(String[] args) {

    }
    public int FindGreatestSumOfSubArray(int[] array) {
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        int sum=0;
        for (int arr:array){
            sum+=arr;
            arrayList.add(sum);
        }

        return 1;
    }
    public static void BubbleSort(int[] array){
//       相邻的元素两两排序,大的往后排
        for (int i=0;i<array.length-1;i++){
            for (int j=0;j<array.length-1-i;j++){
                if (array[i] >array[i+1]){
                     int tmp=array[i];
                     array[i]=array[i+1];
                     array[i+1]=tmp;
                }
            }
        }
    }
}
