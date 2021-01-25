package sort;

import common.Utils;

/**
 * 插入排序
 * <p>
 * 原理：一个数组分为两部分，前面有序，后面无序
 * 取无序数组第一个值，向有序数组中插入
 * <p>
 * 如何插入？
 * 倒序遍历已排序元素，每个值与将要插入的值比较，当待插入元素小于等于某个元素，待插入元素放在当前位置，其余元素后移一位
 * <p>
 * 时间复杂度o(n^2)
 *
 * @author 53137
 */
public class InsertSort {
    public static void main(String[] args) {
        Integer[] arr = {9, 3, 4, 7, 2, 1, 0, 8, 6};
        InsertSort.sort(arr);
        Utils.printArr(arr);
    }

    /**
     * 排序
     *
     * @param arr
     */
    public static void sort(Comparable[] arr) {
        System.out.println("开始排序");
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                System.out.println("开始比较");
                System.out.println("待比较元素1:" + arr[j]);
                System.out.println("待比较元素2:" + arr[j - 1]);
                if (Utils.compare(arr[j - 1], arr[j])) {
                    System.out.println("满足条件开始交换");
                    Utils.exchange(j, j - 1, arr);
                    System.out.println("交换后结果");
                    Utils.printArr(arr);
                } else {
                    break;
                }
            }
        }
    }


}
