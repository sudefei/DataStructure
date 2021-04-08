package com.test.linetable;

import org.junit.Test;
import sort.SortMethod;

import java.util.Arrays;

/**
 * @Author defei.su
 * @Date 2020/10/27 16:51
 */
public class SortTest {
    private static int[] arr={24,35,1,5,19,99,47,10};


    @Test
    public void sortTest(){

//        int[] ints = SortMethod.bubbleSort(arr);
//        System.out.println(Arrays.toString(ints));
//        int[] ints1 = SortMethod.selectSort(arr);
//        System.out.println(Arrays.toString(ints1));

        int[] ints2 = SortMethod.quickSort(arr, 0, 3);
        System.out.println(Arrays.toString(ints2));


    }


}
