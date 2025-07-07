package string;
import java.util.Arrays;
import java.util.Scanner;

public class S2tr13 {
    public static void printStrings(String[] arr) {
        Arrays.sort(arr); // Alphabetical sort

        int maxLen = 0;
        for (String s : arr) {
            if (s.length() > maxLen) {
                maxLen = s.length();
            }
        }

        for (int len = 1; len <= maxLen; len++) {
            StringBuilder sb = new StringBuilder();

            for (String word : arr) {
                if (word.length() == len) {
                    sb.append(word).append(" ");
                }
            }

            if (sb.length() > 0) {
                System.out.println(sb.toString().trim()); // Print without trailing space
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
        }

        printStrings(str);
    }
}
