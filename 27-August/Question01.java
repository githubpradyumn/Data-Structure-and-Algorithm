// package 27-August;

// Container With Most Water 

// You are given an integer array height of length n.
// There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
// Find two lines that together with the x-axis form a container, such that the container contains the most water.// Return the maximum amount of water a container can store.
// Notice that you may not slant the container.

import java.util.*;

public class Question01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of heights: ");
        int n = sc.nextInt();
        int[] h = new int[n];
        System.out.println("Enter heights:");
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        int left = 0, right = n - 1;
        int maxArea = 0;

        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(h[left], h[right]);
            maxArea = Math.max(maxArea, width * minHeight);

            if (h[left] < h[right]) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("Maximum area: " + maxArea);
        sc.close();
    }
}
