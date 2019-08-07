package Sort;

public class 选择 {
    public static void main(String[] args) {
        int[] nums = {9, 5, 2, 7, 1};
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
            for (int n : nums
            ) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
