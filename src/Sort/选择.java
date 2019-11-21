package Sort;

public class 选择 {
    public static void main(String[] args) {
        int[] nums = {9, 5, 2, 7, 1};
        int index = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            index = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[index] > nums[j]) {
                    index = j;
                }
            }
            if (index != i) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }
            for (int n : nums
            ) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
