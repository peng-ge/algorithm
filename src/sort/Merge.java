package sort;

import common.Utils;

/**
 * 归并排序
 * <p>
 * 是分治法的典型应用
 * <p>
 * 原理
 * 1.尽可能将一组数据拆分成两个元素相同的子组，并对每一个子组继续拆分，直到拆分后的每个子组的元素个数是1为止--分
 * 2.将相邻的两个子组合并成一个有序的大组--治
 * 3.不断重复步骤2，直到最终只有一个组为止
 * <p>
 * 时间复杂度
 * O(n*logN)
 *
 * @author 53137
 */
public class Merge {
    public static void main(String[] args) {
        //[9,3,4,7,2,1,0,8]
        //[9,3,4,7]-[2,1,0,8]
        //[9,3][4,7]-[2,1][0,8]
        //[9][3][4][7]-[2][1][0][8]
        //=========================
        //[3,9][4,7]-[1,2][0,8]
        //[3,4,7,9]-[0,1,2,8]
        //[0,1,2,3,4,7,8,9]
        Integer[] arr = {9, 3, 4, 7, 2, 1, 0, 8};
        Merge.sort(arr);
        Utils.printArr(arr);
    }

    /**
     * 辅助数组[用于存放有序数组]
     */
    public static Comparable[] assist;

    /**
     * 排序
     *
     * @param arr
     */
    public static void sort(Comparable[] arr) {
        //初始化辅助数组
        assist = new Comparable[arr.length];
        //拆分-合并-排序
        splitAndMerge(0, arr.length - 1, arr, 0);

    }

    /**
     * 拆分并且合并
     *
     * @param low
     * @param high
     * @param arr
     */
    private static void splitAndMerge(int low, int high, Comparable[] arr, int flag) {
        //校验--此时终止拆分
        System.out.println("开始拆分合并");
        if (low >= high) {
            System.out.println("终止递归");
            return;
        }
        //数组分成两组
        int middle = low + (high - low) / 2;
        System.out.println("low:" + low + "high:" + high + "middle:" + middle);
        //递归拆分
        //左边归并排序，使得左子序列有序
        splitAndMerge(low, middle, arr, 1);
        //右边归并排序，使得右子序列有序
        splitAndMerge(middle + 1, high, arr, 2);
        //将两个有序子数组合并操作
        merge(low, middle, high, arr, flag);
    }

    /**
     * 合并
     * [3,9][4,7]
     *
     * @param low
     * @param middle
     * @param high
     * @param arr
     */
    private static void merge(int low, int middle, int high, Comparable[] arr, int flag) {
        System.out.println("***开始排序并合并" + flag);
        System.out.println("low-" + low + "high-" + high + "middle-" + middle);
        //定义指针
        int i = low;
        int left = low;
        int right = middle + 1;
        //填充
        while (left <= middle && right <= high) {
            System.out.println("==满足条件，进行比较填充");
            if (!Utils.compare(arr[left], arr[right])) {
                //左小于右
                assist[i++] = arr[left++];
            } else {
                assist[i++] = arr[right++];
            }
        }
        while (left <= middle) {
            assist[i++] = arr[left++];
        }
        while (right <= high) {
            assist[i++] = arr[right++];
        }
        //覆盖原数组
        for (int j = low; j <= high; j++) {
            arr[j] = assist[j];
        }
    }
}
