import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
  
  public static void main(String[] args) {
    Deque<String> deque = new ArrayDeque<>();
    deque.add("John");
    deque.add("Jane");
    deque.add("Doe");
    System.out.println("Deque: " + deque);

    // Accessing the head of the deque
 
    String head = deque.peek();
    System.out.println("Head of deque: " + head);

    // Removing elements from the deque
    String removedElement = deque.poll();
    System.out.println("Removed Element: " + removedElement);
    System.out.println("Deque after removal: " + deque);
 
  }
}
