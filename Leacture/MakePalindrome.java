import java.util.HashMap;
import java.util.Map;

public class MakePalindrome {
    public static String getPalindrome(String str) {
        HashMap<Character, Integer> countMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        int oddCount = 0;
        char oddChar = '\0';
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                oddCount++;
                oddChar = entry.getKey();
            }
        }

        if (oddCount > 1 || (oddCount == 1 && str.length() % 2 == 0)) {
            return "NO PALINDROME";
        }

        String firstHalf = "";
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            for (int i = 0; i < entry.getValue() / 2; i++) {
                firstHalf = firstHalf + entry.getKey();
            }
        }

        String secondHalf = "";
        for (int i = firstHalf.length() - 1; i >= 0; i--) {
            secondHalf = secondHalf + firstHalf.charAt(i);
        }

        if (oddCount == 1) {
            return firstHalf + oddChar + secondHalf;
        } else {
            return firstHalf + secondHalf;
        }
    }

    public static void main(String[] args) {
        String str = "ABABABABABABC";
        System.out.println(getPalindrome(str));
    }
}
