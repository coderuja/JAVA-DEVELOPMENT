import java.util.ArrayDeque;
import java.util.Deque;

public class array {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);       // [30, 20, 10]
        System.out.println(stack.peek()); // 30
        System.out.println(stack.pop());  // 30
        System.out.println(stack);        // [20, 10]
    }
}
