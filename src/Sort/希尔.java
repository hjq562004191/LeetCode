package Sort;

import java.util.LinkedList;

public class 希尔 {
    public static void main(String[] args) {
        int[] nums = {6, 2, 1, 5, 1, 1, 5, 5, 6, 9, 1, 4, 2, 3};
        shellsort(nums);
        LinkedList
        for (int num : nums
        ) {
            System.out.print(num + " ");
        }
    }

    private static void shellsort(int[] nums) {
        int N = nums.length / 2;
        while (N != 0) {
            for (int i = 1; i < nums.length; i++) {
                int j = 0;
                int temp = nums[i];

                for (j = i - N; j >= 0 && temp < nums[j]; j -= N) {
                    nums[j + N] = nums[j];
                }
                nums[j + N] = temp;
            }
            N /= 2;
        }
    }
}
