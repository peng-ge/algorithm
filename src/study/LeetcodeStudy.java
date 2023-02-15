package study;

public class LeetcodeStudy {
    public static void main(String[] args) {
        int nums[] = {1, 1, 2};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int index = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[index] == nums[i]) {
                nums[i] = nums[i + 1];
            }
        }

        //遍历
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        //找出重复元素
        return nums.length;
    }
}
