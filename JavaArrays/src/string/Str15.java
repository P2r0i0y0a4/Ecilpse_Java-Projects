package string;
import java.util.Scanner;

public class Str15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] words = new String[n];
        int[] freq = new int[n];
        int uniqueCount = 0;

        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            boolean found = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (words[j].equals(word)) {
                    freq[j]++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                words[uniqueCount] = word;
                freq[uniqueCount] = 1;
                uniqueCount++;
            }
        }
        int maxFreq = 0;
        String mostFrequent = "";

        for (int i = 0; i < uniqueCount; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                mostFrequent = words[i];
            }
        }
        System.out.println(mostFrequent);
    }
}



