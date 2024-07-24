package c4queue.d2linkedlist;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// Java에서 제공하는 Queue
public class QueueMain {
    public static void main(String[] args) {
        // Java의 Stack은 class다.
        Stack<Integer> stack = new Stack<>();
        // Java의 Queue는 interface다.
        // interface는 객체화 할 수 없기 때문에
        // LinkedList 구현체를 사용한다.
        Queue<Integer> queue = new LinkedList<>();
        // enQueue - add, offer
        // 넣기를 시도하고, 실패할 경우 예외가 발생
        queue.add(10);
        queue.add(20);
        queue.add(30);
        // 넣기를 시도하고, 실패할 경우 false 반환
        queue.offer(15);
        queue.offer(25);
        queue.offer(35);

        // deQueue - remove, poll
        // 빼기를 시도하고, 실패할 경우 예외가 발생
        System.out.println(queue.remove());  // 10
        System.out.println(queue.remove());  // 20
        System.out.println(queue.remove());  // 30
        // 빼기를 시도하고, 실패할 경우 null이 반환
        System.out.println(queue.poll());  // 15
        System.out.println(queue.poll());  // 25
        System.out.println(queue.poll());  // 35

        // System.out.println(queue.remove());  // 예외 발생
        System.out.println(queue.poll());  // null

        queue.offer(5);
        // peek - element, peek
        // 다음에 나오게될 원소를 살펴보는 기능
        // 다음 원소를 확인해 보는데, 비어있으면 예외 발생
        System.out.println(queue.element());
        // 다음 원소를 확인해 보는데, 비어있으면 null이 반환
        System.out.println(queue.peek());

        // 그 외...
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());






        int[] array = new int[128];








    }
}
