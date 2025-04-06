import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Push items onto the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        // Display top item
        System.out.println("Top item: " + stack.peek());

        // Pop the top item
        System.out.println("Removed item: " + stack.pop());

        // Display remaining stack
        System.out.println("Current stack: " + stack);

        // Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
