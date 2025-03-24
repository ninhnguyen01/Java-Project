import java.util.LinkedList;
import java.util.Queue;

// Queue Data Structure - First In First Out Concept (FIFO)
public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Add to queue
        queue.offer("Clovis I - King");
        queue.offer("Charlemagne - Emperor");
        queue.offer("Theodoric the Great - King");
        queue.offer("Ragnar - Viking Hero");

        if (queue.isEmpty()) {
            System.out.println(true);
        }

        else {
            // View queue size
            System.out.println("Queue size: " + queue.size());
            // Check if item in queue
            System.out.println("Item in queue: " + queue.contains("Clovis I - King"));
            // View first item in queue
            System.out.println("First item in queue: " + queue.peek());
            // View all item in queue
            System.out.println(queue);
            // remove first item in queue
            System.out.println("First item removed: " + queue.poll());
            // View new queue size
            System.out.println("Queue size: " + queue.size());
            // print out queue again to verify
            System.out.println(queue);
        }
    }
}