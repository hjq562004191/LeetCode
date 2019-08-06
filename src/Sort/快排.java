package Sort;

public class 快排 {
    public static void main(String[] args) {
        int[] nums = {6, 2, 1, 5, 1, 1, 5, 6, 7, 8, 6, 4};
        qsort(nums, 0, nums.length - 1);
        for (int num : nums
        ) {
            System.out.print(num + " ");
        }
    }

    private static void qsort(int[] nums, int left, int right) {
        if (left < right) {
            int base = division(nums, left, right);

            qsort(nums,left,base-1);
            qsort(nums,base+1,right);
        }

    }

    private static int division(int[] nums, int left, int right) {
        int base = nums[left];
        while (left < right) {
            while (true) {
                if (left > right) {
                    break;
                }
                if (nums[right] < base) {
                    nums[left] = nums[right];
                    break;
                } else {
                    right--;
                }
            }
            while (true) {
                if (left >= right) {
                    break;
                }
                if (nums[left] >= base) {
                    nums[right] = nums[left];
                    break;
                } else {
                    left++;
                }
            }
        }
        nums[left] = base;
        return left;
    }
}
