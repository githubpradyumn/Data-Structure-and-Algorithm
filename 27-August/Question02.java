// package 27-August;

// Trapping Rainwater

// 42. Trapping Rain Water

// Given n non-negative integers representing an elevation map where the width of each bar is 1,
//  compute how much water it can trap after raining.

// Example 1:

// Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
// Output: 6
// Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1].
//  In this case, 6 units of rain water (blue section) are being trapped.

import java.util.*;

class Question02 {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    water += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    water += rightMax - height[right];
                }
                right--;
            }
        }
        return water;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of bars: ");
        int n = sc.nextInt();
        int[] height = new int[n];
        System.out.println("Enter heights:");
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }
        Question02 obj = new Question02();
        int result = obj.trap(height);
        System.out.println("Trapped water: " + result);
        sc.close();
    }
}

