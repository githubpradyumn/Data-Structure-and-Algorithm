import java.util.Arrays;

// Array Leader

public class Solution02 {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int maximumRight = -1;

        for (int i = n - 1; i >= 0; i--) {
            int current = arr[i];
            arr[i] = maximumRight;
            maximumRight = Math.max(maximumRight, current);
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1}; // fixed array
        Solution02 obj = new Solution02();
        int[] result = obj.replaceElements(arr);
        System.out.println(Arrays.toString(result));
    }
}
