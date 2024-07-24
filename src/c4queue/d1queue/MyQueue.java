package c4queue.d1queue;

public class MyQueue {
    // 데이터를 담기 위한 배열
    private int[] arr = new int[16];
    // 제일 앞쪽(다음에 나가야 되는 데이터)를 가르키기 위한 front
    private int front = -1;
    // 제일 뒤쪽(다음에 데이터가 들어가야하는 곳)을 가르키기 위한 rear
    private int rear = -1;

    // 데이터 추가하는 enQueue
    public void enQueue(int x) {
        // rear의 크기를 하나 키워주고
        rear++;
        // 해당 위치에 넣어준다.
        arr[rear] = x;
    }

    // 데이터 제거하는 deQueue
    public int deQueue() {
        // front의 크기를 하나 키워주고,
        front++;
        // 해당 위치의 데이터를 반환한다.
        return arr[front];
    }

    // Queue가 비었는지 확인하는 isEmpty()
    public boolean isEmpty() {
        return front == rear;
    }

    // Queue가 가득 차있는지 반환하는 isFull()
    public boolean isFull() {
        // 잘못된 포화상태 인식
        // 가득 차지 않았는데 가득 찼다고 착각을 한다.
        return rear == arr.length - 1;
    }
}
