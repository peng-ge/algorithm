package sort;

import common.Utils;

/**
 * 希尔排序，插入排序加强版 核心比较，交换
 * <p>
 * 步骤：
 * (1)选定一个增长量，按照增长量分组
 * (2)对分好组的每组元素比较，交换
 * (3)减小增长量至1,重复步骤2
 * <p>
 * 增长量如何计算？
 * int h=1;
 * while(h<arr.length / 2){
 * h=2*h+1;
 * }
 * h衰减规则
 * h=h/2;
 *
 * @author 53137
 */
public class ShellSort {
    public static void main(String[] args) {
        Integer[] arr = {9, 3, 4, 7, 2, 1, 0, 8, 6, 5};
        ShellSort.sort(arr);
        Utils.printArr(arr);
    }

    public static void sort(Comparable[] arr) {
        int h = 1;
        while (h < arr.length / 2) {
            h = 2 * h + 1;
        }

        while (h >= 1) {
            System.out.println(h);
            //1.待插入元素
            for (int i = h; i < arr.length; i++) {
                Utils.printArr(arr);
                //2.待插入元素插入至有序队列
                for (int j = i; j >= h; j -= h) {
                    if (Utils.compare(arr[j - h], arr[j])) {
                        Utils.exchange(j, j - h, arr);
                    } else {
                        break;
                    }
                }
            }
            h = h / 2;
        }
    }
}
