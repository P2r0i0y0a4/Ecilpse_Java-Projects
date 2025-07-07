package string;
import java.util.Scanner;
public class Uppertoconvert {
    public static String convert(String input) {
        return input.toLowerCase();  // Built-in method
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        String input = sc.nextLine();
        String output = convert(input);
        System.out.println("Converted: " + output);  // Output: java
    }
}


