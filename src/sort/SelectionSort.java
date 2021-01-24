package sort;

/**
 * 选择排序 找到最小值，交换位置
 * <p>
 * 原理：找出最小值所在索引，然后与第一个索引处的值交换位置
 * 如何找到最小值所在索引？
 * 假定第一个索引处是最小值，接着依次和其他索引处值进行比较，若假定的最小值大于其他索引处的值，更换最小值索引
 * <p>
 * 时间复杂度 n^2
 *
 * @author 53137
 */
public class SelectionSort {

    public static void main(String[] args) {
        Integer[] arr = {9, 3, 4, 7, 2, 1, 0, 8, 6};
        SelectionSort.sort(arr);
        SelectionSort.print(arr);
    }

    /**
     * 排序
     *
     * @param arr
     */
    public static void sort(Comparable[] arr) {
        System.out.println("开始比较");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println("开始第" + (i + 1) + "次比较");
            int minIndex = i;
            System.out.println("初始最小索引是:" + minIndex);
            for (int j = i + 1; j < arr.length; j++) {
                //int minIndex = j;
                System.out.println("比较时假定最小索引是:" + minIndex);
                System.out.println("待比较值1:" + arr[minIndex]);
                System.out.println("待比较值2:" + arr[j]);
                if (SelectionSort.compare(minIndex, j, arr)) {
                    System.out.println("最小索引发生变化");
                    minIndex = j;
                }
                System.out.println("当前最小索引是:" + minIndex);
            }
            System.out.println("第" + (i + 1) + "次比较后最小索引是:" + minIndex);
            System.out.println("交换前结果");
            SelectionSort.print(arr);
            SelectionSort.exchange(i, minIndex, arr);
            System.out.println("索引" + i + "索引" + minIndex + "进行交换");
            System.out.println("交换后结果");
            SelectionSort.print(arr);
            System.out.println("============================");
        }
    }

    /**
     * 比较
     */
    private static boolean compare(int curIndex, int nextIndex, Comparable[] arr) {
        return arr[curIndex].compareTo(arr[nextIndex]) > 0;
    }

    /**
     * 交换
     */
    private static void exchange(int curIndex, int resultIndex, Comparable[] arr) {
        Comparable temp = arr[curIndex];
        arr[curIndex] = arr[resultIndex];
        arr[resultIndex] = temp;
    }

    /**
     * 打印
     *
     * @param arr
     */
    private static void print(Comparable[] arr) {
        for (Comparable comparable : arr) {
            System.out.print(comparable + "_");
        }
        System.out.println();
    }


}
