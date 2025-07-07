package string;
import java.util.Scanner;

public class StringCountLast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("s = ");
        String s = scanner.nextLine();
        s = s.trim();
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            } else {
                break;
            }
        }
        System.out.println("Output: " + length);
    }
}
