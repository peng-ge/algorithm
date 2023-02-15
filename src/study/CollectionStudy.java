package study;

import java.util.*;

/**
 * @author 53137
 */
public class CollectionStudy {
    public static void main(String[] args) {
        //Collection
        Collection<String> collection = new ArrayList<>();
        collection.add("1");
        collection.add("2");
        //得到迭代器
        Iterator<String> iterator = collection.iterator();
        //hasNext()方法；1. 判断集合中是否还有元素
        while (iterator.hasNext()) {
            //next()方法；1. 指针下移；2. 将下移后集合位置上的元素返回
            String next = iterator.next();
            System.out.println(next);
        }
        for (String s : collection) {
            System.out.println(s);
        }
        System.out.println("======冒泡排序=======");
        int[] arr = {1, 3, 6, 2, 4, 9, 8};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("" + i);
        }
        for (int i = 0; i < 5; i++) {
            list.add(i + "");
        }

        List<String> vector = new Vector<>();
        for (int i = 0; i < 10; i++) {
            vector.add("" + i);
        }
        for (int i = 0; i < 5; i++) {
            vector.add(i + "");
        }
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("1");

        Set<String> set = new HashSet<>();
        //true
        System.out.println(set.add(new String("123")));
        //false
        System.out.println(set.add(new String("123")));

        Set<String> lSet = new LinkedHashSet<>();

    }
}
