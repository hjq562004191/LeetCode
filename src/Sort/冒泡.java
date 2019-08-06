package Sort;

public class 冒泡 {
    public static void main(String[] args) {
        int[] nums = {5,3,1,5,4,8,6,9,1,0,3};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
