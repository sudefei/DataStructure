package com.array;

public class ArrayTwo {
    public static void main(String args[]) {
//        int[][] arr = {{3, 6, 5}, {8, 2, 3}};
//        Find(10, arr);
        int[] array={1,2,3};
        BinarySerach02(5,array);

    }

    public static boolean Find(int target, int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) {
                    System.out.println("array contains target:" + target);
                    return true;
                }
            }
        }
        System.out.println("array  not contains target:" + target);
        return false;
    }
//属于二分查找，先找到中间的数据，与中间的数据进行比较，大于的话查右边的数据，在进行二分
//                                                      小于的话查左边的数据，在进行二分
    public boolean Find02(int target, int [][] array) {
        int rows = array.length;
        int cols = array[0].length;
        int i=rows-1,j=0;
        while(i>=0 && j<cols){
            if(target<array[i][j])
                i--;
            else if(target>array[i][j])
                j++;
            else
                return true;
        }
        return false;
    }
    //递归的思想
    public static int BinarySearch01(int target,int high,int low, int [] array){
        if (target<array[low] || target > array[high] || low > high)
            return -1;
        int middle=(low+high)/2;
        if(target<array[middle]){
            BinarySearch01(target,middle-1,low,array);
        }else if (target>array[middle]){
            BinarySearch01(target,high,middle+1,array);
        }else{
            return middle;
        }
        return -1;
    }
    //不使用递归，使用while 循环
    public static int BinarySerach02(int target,int [] array){
        int low=0;
        int high=array.length-1;
        //局部变量必须赋初始值
        int middle=0;
        if (target<array[low] || target > array[high] || low > high)
            return -1;
        while(low<=high){
            middle=(low+high)/2;
            if (target<array[middle]){
                high=middle+1;
            }else if (target>array[middle]){
                low=middle-1;
            }else {
                return middle;
            }
        }
        return -1;
    }

//   Python
//   function Find(target, array) {
//        let cow = array[0].length;
//        for (let i = 0; i < cow; i++) {
//            if (array[i].indexOf(target) == -1 ? false : true) {
//                return true;
//            }
//        }
//        return false;
//    }
}