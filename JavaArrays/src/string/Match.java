package string;
import java.util.Scanner; 

public class Match {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        return length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("--- Length of Last Word ---");
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        Match m = new Match();
        int result = m.lengthOfLastWord(str);
        System.out.println("Output: " + result);
    }
}