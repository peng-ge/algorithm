package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * 选择排序：找最小值下标，和前面元素交换位置
 *
 * @author 53137
 */
public class SortStudy {
    public static void main(String[] args) {
        int arr[] = {9, 4, 5, 7, 8, 6, 3, 2, 1};
        Util.print(arr);
        SelectionSort(arr);
    }

    /**
     * 选择排序：时间复杂度O(n^2)
     *
     * @param arr
     */
    public static void SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //假设最小值
            int minPos = i;
            //找到最小值下标所在位置
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            System.out.println("第" + i + "次，最小值下标：" + minPos);
            //交换
            Util.swap(arr, i, minPos);
            //输出
            Util.print(arr);
        }
        System.out.println("最终结果");
        Util.print(arr);
    }


}

/**
 * 数据校验
 */
class DataChecker {
    private static int[] generateArr(int count) {
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = new Random().nextInt(count);
        }
        return arr;
    }

    public static boolean check() {
        int arr[] = DataChecker.generateArr(50);
        System.out.println("生成的数组");
        Util.print(arr);
        int copyArr[] = Arrays.copyOf(arr, arr.length);
        System.out.println("拷贝的数组");
        Util.print(arr);
        System.out.println("==============");
        //系统排序
        Arrays.sort(arr);
        SortStudy.SelectionSort(copyArr);
        System.out.println("==============");
        System.out.println("系统排序后结果");
        Util.print(arr);
        System.out.println("选择排序后结果");
        Util.print(copyArr);
        //比较
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != copyArr[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("比较结果" + DataChecker.check());
    }
}

class Util {
    public static void print(int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int minPos) {
        int temp = arr[minPos];
        arr[minPos] = arr[i];
        arr[i] = temp;
    }
}
