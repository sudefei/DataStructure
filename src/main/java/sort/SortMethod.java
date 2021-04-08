package sort;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.Arrays;

/**
 * @Author defei.su
 * @Date 2020/10/27 15:52
 */
public class SortMethod {

    /**
     * 冒泡排序，两两比较，第一次最大值出现在最大索引处，第二次比较第二大值出现在倒数第二索引处
     *
     * @param intArr 数组
     */
    public static int[] bubbleSort(int[] intArr) {
        // 外部是 需要比较多少趟
        for (int j = 0; j < intArr.length; j++) {
            // 内部是 当前趟需要比较的次数，所以一直从 0 开始
            for (int i = 0; i < intArr.length - 1 - j; i++) {
                // 两两比较，较大的往后放
                if (intArr[i] > intArr[i + 1]) {
                    int temp = intArr[i];
                    intArr[i] = intArr[i + 1];
                    intArr[i + 1] = temp;
                }
            }
        }
        return intArr;
    }


    /**
     * 选择排序：从0 索引开始，依次和后面的元素进行比较，小的往前放，第一次比较之后最小值出现在最小的索引处。第二次比较之后第二小值出现在第二个索引处。
     *
     * @param intArray
     */
    public static int[] selectSort(int[] intArray) {
        // 外部是需要多少趟排序
        for (int y = 0; y < intArray.length - 1; y++) {
            // 内部是 当前趟数要比较的次数，但索引是依次增加的
            for (int x = y + 1; x < intArray.length; x++) {
                // 两两比较，较小的往前放
                if (intArray[x] < intArray[y]) {
                    int temp = intArray[y];
                    intArray[y] = intArray[x];
                    intArray[x] = temp;
                }
            }
        }
        return intArray;
    }

    /**
     * 快速排序: 先找一个基准数，分别从左右两侧向内部扫描，直到左边扫描到比基准数大的值
     *           右边扫描到比基准数小的值，将两个数据互换位置，一直扫描，直到左右两边相遇，将基准数与                   left 互换位置即可，这是一次排序，使得基准数左边的数都比 基准数小，基准数右边的都比基                  准数大，然后将数据分为两列，在分别对该两列的数据进行快排。直到最后数据的元素为 1                      个时，排序结束。
     *
     * @param array 数组
     * @param L 指向数组的第一个元素
     * @param R 指向数组的最后一个元素
     */
    public static int[] quickSort(int[] array,int L ,int R){
        int i = L;
        int j = R;

        //设置一个基准数, 支点
        int pivot = array[(L + R) / 2];

        //左右两端开始扫描，直到左右两端还没有相遇
        while (i <= j){

            //扫描左边，直到遇到比 基准数大的数据
            while (array[i] < pivot)
                i++;

            //扫描右边，直到遇到比 基准数小的数据
            while (array[j] > pivot)
                j--;

            //此时已分别找到两侧的数据，将两个数据进行位置互换
            if (i <= j){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        //第一趟排序得到 基准数左边的数据都比基准数小
        //              基准数右边的数据都比基准数大
        //开始分别对基准数左右两边的数组进行快速排序

        //"左边" 开始快速排序，直到只剩最后一个元素
        if (L <j){
            quickSort(array,L,j);
        }

        // "右边" 开始快速排序，直到只剩最后一个元素
        if (R > i){
            quickSort(array,i,R);
        }

        return array;
    }


}