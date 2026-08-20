import java.util.Stack;

public class Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        // Peek top element
        System.out.println("Top element: " + stack.peek());

        // Pop element
        System.out.println("Removed: " + stack.pop());

        System.out.println("Stack after pop: " + stack);

        // Check if empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Size
        System.out.println("Size: " + stack.size());
    }
}
