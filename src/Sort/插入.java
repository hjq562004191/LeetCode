package Sort;

public class 插入 {
    public static void main(String[] args) {
        int[] nums = {6, 2, 1, 5, 1, 1, 5, 6, 7, 8, 6, 4};
        insertsqrt(nums);
        for (int n:nums
             ) {
            System.out.print(n + " ");
        }
    }

    private static void insertsqrt(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            int j = 0;
            int temp = nums[i];

            for (j = i-1; j >=0 && temp < nums[j] ; j--) {
                nums[j+1] = nums[j];
            }
            nums[j+1] = temp;
        }
    }

}
