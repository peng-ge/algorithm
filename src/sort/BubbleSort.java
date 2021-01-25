package sort;

import common.Utils;

/**
 * 冒泡排序 两两比较，找大值，然后交换位置
 * <p>
 * 原理：
 * 比较相邻的元素，如果前一个元素比后一个元素大，就交换两元素位置
 * 对每一对相邻元素做同样工作，从第一对到最后一对，最终最后位置的元素就是最大值
 * <p>
 * 时间复杂度o(n^2)
 *
 * @author 53137
 */
public class BubbleSort {
    public static void main(String[] args) {
        Integer[] arr = {9, 3, 4, 7, 2, 1, 0, 8, 6};
        BubbleSort.sort(arr);
        Utils.printArr(arr);
    }

    public static void sort(Comparable[] arr) {
        System.out.println("原始值");
        Utils.printArr(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("第" + (i + 1) + "次");
            for (int j = 0; j < arr.length - 1; j++) {
                System.out.println("待比较值");
                System.out.println("值1:" + arr[j]);
                System.out.println("值2:" + arr[j + 1]);
                if (Utils.compare(arr[j], arr[j + 1])) {
                    Utils.exchange(j, j + 1, arr);
                }
                System.out.println("比较后结果");
                Utils.printArr(arr);
            }
            System.out.println("第" + (i + 1) + "次排序结果");
            Utils.printArr(arr);
        }
    }



}
