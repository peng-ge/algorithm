package common;

import java.util.Arrays;

/**
 * 工具类
 *
 * @author 53137
 */
public class Utils {
    /**
     * 打印数组中每一个元素
     *
     * @param arr
     */
    public static void printArr(Comparable[] arr) {
        System.out.println(Arrays.asList(arr).toString());
    }

    /**
     * 比较arr[index1]>arr[index2]->true
     *
     * @param index1
     * @param index2
     * @param arr
     * @return
     */
    public static boolean compare(int index1, int index2, Comparable[] arr) {
        return arr[index1].compareTo(arr[index2]) > 0;
    }

    /**
     * 比较o1>o2->true
     *
     * @param o1
     * @param o2
     * @return
     */
    public static boolean compare(Comparable o1, Comparable o2) {
        return o1.compareTo(o2) > 0;
    }

    /**
     * 交换
     *
     * @param index1
     * @param index2
     * @param arr
     */
    public static void exchange(int index1, int index2, Comparable[] arr) {
        Comparable temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
