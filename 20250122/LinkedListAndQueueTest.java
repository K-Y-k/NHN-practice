import java.util.LinkedList;
import java.util.Queue;

public class LinkedListAndQueueTest {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.offer("String1");
        list.add("String2");
        String s1 = list.poll();
        String s2 = list.peek();

        // 큐의 구현체는 LinkedList 과 ArrayDeque
        Queue<String> q = new LinkedList<>();
        // 큐에서 요소 넣기 메소드
        q.offer("String");
        q.offer("String2");
        q.add("String3");

        // 큐에서 요소 빼는 메소드
        String s3 = q.poll();
        String s4 = q.peek();

        // 큐에서 요소 빼지는 않고 가져오는 메소드
        q.element();
    }
}
