package c4queue.d1queue;

public class Main {
    public static void main(String[] args) {
        MyQueue intQueue = new MyQueue();
        // 네번 데이터를 넣었고,
        intQueue.enQueue(3);
        intQueue.enQueue(5);
        intQueue.enQueue(7);
        intQueue.enQueue(11);
        System.out.println(intQueue.isEmpty());
        // 네번 데이터를 뺏다.
        System.out.println(intQueue.deQueue());
        System.out.println(intQueue.deQueue());
        System.out.println(intQueue.deQueue());
        System.out.println(intQueue.deQueue());
        // 이제는 비어있어야 한다.
        System.out.println(intQueue.isEmpty());

        for (int i = 0; i < 12; i++) {
            intQueue.enQueue(i);
        }
        // front == 3
        // rear == 15
        System.out.println(intQueue.isFull());

        System.out.println("========================================");

        MyCyQueue intCyQueue = new MyCyQueue();
        System.out.println(intCyQueue.isEmpty());
        System.out.println(intCyQueue.isFull());
        intCyQueue.enQueue(0);
        intCyQueue.enQueue(1);
        intCyQueue.enQueue(2);
        intCyQueue.enQueue(3);
        System.out.println(intCyQueue.isEmpty());
        System.out.println(intCyQueue.isFull());
        System.out.println("start dequeue");
        System.out.println(intCyQueue.deQueue());
        System.out.println(intCyQueue.deQueue());
        System.out.println(intCyQueue.deQueue());
        System.out.println(intCyQueue.deQueue());
        System.out.println(intCyQueue.isEmpty());
        System.out.println(intCyQueue.isFull());
        intCyQueue.enQueue(4);
        intCyQueue.enQueue(5);
        intCyQueue.enQueue(6);
        intCyQueue.enQueue(7);
        System.out.println(intCyQueue.isEmpty());
        System.out.println(intCyQueue.isFull());
    }
}
