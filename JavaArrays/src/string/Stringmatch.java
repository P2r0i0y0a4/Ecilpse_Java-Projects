package string;
import java.util.Scanner;

public class Stringmatch {

    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        String[] charToWord = new String[26]; 

        for (int i = 0; i < pattern.length(); i++) {
            int index = pattern.charAt(i) - 'a';
            String word = words[i];

            if (charToWord[index] != null) {
                if (!charToWord[index].equals(word)) {
                    return false;
                }
            } else {
                for (int j = 0; j < 26; j++) {
                    if (word.equals(charToWord[j])) {
                        return false;
                    }
                }
                charToWord[index] = word;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pattern: ");
        String pattern = sc.nextLine();
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        boolean result = wordPattern(pattern, s);
        System.out.println("Output: " + result);
    }
}
