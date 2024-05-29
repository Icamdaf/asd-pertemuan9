package percobaan1;
import java.util.Stack;

public class StackDemo20 {
    public static void main(String[] args) {
        Stack20 stack = new Stack20(10);
        stack.push(8);
        stack.push(12);
        stack.push(18);
        stack.print();
        stack.pop();
        stack.peek();
        stack.pop();
        stack.push(-5);
        stack.print();
    }
}