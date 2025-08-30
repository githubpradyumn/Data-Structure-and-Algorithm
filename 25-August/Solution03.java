import java.util.*;

// Min To MAx

public class Solution03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); 
            int[] arr = new int[n];
            int min = Integer.MAX_VALUE;

            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
                if (arr[j] < min) {
                    min = arr[j];
                }
            }

            int ans = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] != min) {
                    ans++;
                }
            }

            System.out.println(ans);
        }
        sc.close();
    }
}
