import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
public class BlockingQueueExample {

  public static void main(String[] args) throws InterruptedException {
    
    BlockingQueue<String> queue = new ArrayBlockingQueue<>(2);
    queue.put("John");
    queue.put("Jane");
    queue.put("Jim");
    queue.put("Jack");
    queue.put("Jade");
    queue.put("Joe");
    queue.put("Janie");
    queue.put("Jassie");
    System.out.println("BlockingQueue: " + queue);


    // Adding an element (will block if queue is full)
    queue.put("Doe"); // This will block since the queue is full

    // Accessing the head of the queue
    String head = queue.peek();
    System.out.println("Head of BlockingQueue: " + head);

    // Removing elements from the queue
    String removedElement = queue.take();
    System.out.println("Removed Element: " + removedElement);
    System.out.println("BlockingQueue after removal: " + queue);
 
  }
}
