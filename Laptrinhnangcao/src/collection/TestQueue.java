package collection;
import java.util.Queue;
import java.util.LinkedList;
public class TestQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.offer("Ha Noi");
        queue.offer("Hue");
        queue.offer("Da Nang");
        queue.offer("Ho Chi Minh");

        while(queue.size() > 0) {
            System.out.println("Queue's size: " + queue.size());
            System.out.println("Removing " + queue.remove() + " in queue");
            System.out.println("Remaining: " + queue.toString());
        }
    }
}