import java.util.*;
public class _114_pushatbottom {
    public static void pushatbottom(Stack<Integer> s , int data){
        if (s.empty()){
            s.push(data);
            return ;
        }
        int top = s.pop();
        pushatbottom(s,data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushatbottom(s,4);
        while(!s.empty()){
          System.out.println(s.peek());
          s.pop();
        }
    }
}
