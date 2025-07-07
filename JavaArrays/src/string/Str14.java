package string;
import java.util.Scanner;

public class Str14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        String[] input = new String[n];
        String[] unique = new String[n];
        int uniqueCount = 0;

        for (int i = 0; i < n; i++) {
            input[i] = sc.nextLine();
        }

        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (input[i].equals(unique[j])) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                unique[uniqueCount] = input[i];
                uniqueCount++;
            }
        }

        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(unique[i]);
            if (i < uniqueCount - 1) {
                System.out.print(" ");
            }
        }
    }
}
