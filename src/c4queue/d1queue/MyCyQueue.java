package c4queue.d1queue;

// My Cyclic Queue
public class MyCyQueue {
    // 내가 실제로 만들고 싶은 Queue 사이즈
    private int size = 4;
    // 원형 Queue는 실제보다 + 1 만큼 크기를 만들어줘야 된다.
    private int offset = size + 1;
    // offset을 바탕으로 배열을 만든다.
    private int[] arr = new int[offset];
    // 앞쪽, 뒤쪽: front, rear
    private int front = 0;
    private int rear = 0;

    // enQueue
    public void enQueue(int x) {
        if (this.isFull())
            throw new RuntimeException("Queue is full");

        // rear의 위치에 데이터 넣기
        arr[rear] = x;
        // 위치 재설정
        rear = (rear + 1) % offset;
    }

    // deQueue
    public int deQueue() {
        if (this.isEmpty())
            throw new RuntimeException("Queue is empty");

        // 반환할 데이터 준비
        int value = arr[front];
        // 위치 재설정
        front = (front + 1) % offset;
        return value;
    }

    // isEmpty
    public boolean isEmpty() {
        return rear == front;
    }

    // isFull
    public boolean isFull() {
        // 다음에 데이터를 넣을 곳 (rear + 1)
        // 과 front가 일치할 경우 full
        return (rear + 1) % offset == front;
    }
}
