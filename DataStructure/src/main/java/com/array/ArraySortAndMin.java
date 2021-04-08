package com.array;

import java.util.ArrayList;

public class ArraySortAndMin {


    public static void main(String[] args) {
        int[] arr={5,6,2,3,1,9,0};
        System.out.println("the min value of arr is :"+getMin(arr));
    }

    public static int  getMin(int[] array){
        if (array.length == 0)
            return 0;

        int min=array[0];
        for(int i=0;i< array.length;i++){
             if(min > array[i]){
                 min=array[i];
             }
        }
       return min;
    }



}
