package collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> queue1 = new PriorityQueue<>();
        queue1.offer("Ha Noi");
        queue1.offer("Hue");
        queue1.offer("Da Nang");
        queue1.offer("Ho Chi Minh");

        System.out.println("Queue: " + queue1);
        while(queue1.size() > 0) {
            System.out.println("Removing: " + queue1.remove());
        }
        System.out.println("Queue: " + queue1);

        PriorityQueue<String> queue2 = new PriorityQueue<>(4, Collections.reverseOrder());
        queue2.offer("Ha Noi");
        queue2.offer("Hue");
        queue2.offer("Da Nang");
        queue2.offer("Ho Chi Minh");

        System.out.println("Queue: " + queue2);
        while(queue2.size() > 0) {
            System.out.println("Removing: " + queue2.remove());
        }
        System.out.println("Queue: " + queue2);
    }
}
