import java.util.*;

public class _117_stockSpan {
    public static void stockspan(int stocks[], int span[]) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for (int i = 1; i < stocks.length; i++) {
            int currprice = stocks[i];
            while (!s.empty() && currprice > stocks[s.peek()]) {
                s.pop();
            }
            if (s.empty()) {
                span[i] = i + 1;
            } else {
                int prevhigh = s.peek();
                span[i] = i - prevhigh;
            }
            s.push(i);
        }
    }

    public static void main(String[] args) {
        int stocks[] = { 100, 80, 60, 70, 60, 85, 100 };
        int span[] = new int[stocks.length];
        stockspan(stocks, span);
        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] +" ");
        }
    }
}
