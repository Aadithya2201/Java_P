import java.util.HashMap;
import java.util.Scanner;

public class longestsubarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int max = 0;
        int left = 0;
        int startIndex = 0;

        HashMap<Character, Integer> p = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);

            if (p.containsKey(current)) {
                left = Math.max(left, p.get(current) + 1);
            }

            p.put(current, i);

            int currentLen = i - left + 1;
            if (currentLen > max) {
                max = currentLen;
                startIndex = left;
            }
        }

        String longestSubstring = input.substring(startIndex, startIndex + max);
        System.out.println("Longest substring without repeating characters: " + longestSubstring);
        System.out.println("Length of the longest substring without repeating characters: " + max);
    }
}
