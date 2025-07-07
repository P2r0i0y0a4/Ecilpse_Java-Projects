package stackkkkk;
import java.util.Stack;

public class test {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70);
        s.push(80);
        s.push(90);
        s.push(100);
        System.out.println(s);

        int num = 50;

        int pos = s.search(num);

        if (pos != -1) {
            for (int i = 0; i < pos - 1; i++) {
                s.pop();
            }
        } else {
            System.out.println("Number not found.");
        }

        System.out.println("Updated Stack: " + s);
    }
}
