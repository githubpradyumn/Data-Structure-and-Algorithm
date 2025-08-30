import java.util.Arrays;

// Moves zeroes to end

public class Solution04 {
    public void moveZeroes(int[] nums) {
        int nonzero = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                // Swap nums[i] and nums[nonzero]
                int temp = nums[i];
                nums[i] = nums[nonzero];
                nums[nonzero] = temp;

                nonzero++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12}; // fixed array
        Solution04 obj = new Solution04();
        obj.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
