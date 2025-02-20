import java.util.*;

public class _116_reverseStack {
    public static void pushatbottom(Stack<Integer> s, int data) {
        if (s.empty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushatbottom(s, data);
        s.push(top);

    }

    public static void reversestack(Stack<Integer> s) {
        if (s.empty()) {
            return;
        }
        int top = s.pop();
        reversestack(s);
        pushatbottom(s, top);
    }

    public static void printstack(Stack<Integer> s) {
        while (!s.empty()) {
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reversestack(s);
        printstack(s);
    }
}
