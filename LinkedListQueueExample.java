import java.util.LinkedList;
import java.util.Queue;
public class LinkedListQueueExample {
  public static void main(String[] args) {
    Queue<String> queue = new LinkedList<>();
     queue.add("John");
     queue.add("Jane");
     queue.add("Doe");
    System.out.println("Queue: " + queue);

  // Accessing the head of the queue
   String head = queue.peek();
   System.out.println("Head of queue: " + head);

  // Removing elements from the queue
   String removedElement = queue.poll();
    System.out.println("Removed Element: " + removedElement);
    System.out.println("Queue after removal: " + queue);
  }
}
