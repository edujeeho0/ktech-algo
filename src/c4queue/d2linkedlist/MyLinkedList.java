package c4queue.d2linkedlist;

public class MyLinkedList {
    // 안쪽에 새로운 class를 만든다.
    private static class Node {
        // 데이터를 담고 있는 변수
        private int data;
        // 다음 데이터의 위치를 담고있는 변수
        private Node link;
    }

    // 첫번째 데이터가 존재할 위치
    private Node start;

    // 데이터를 추가하는 add
    public void add(int x) {
        // 아직 LinkedList에 데이터가 없는 경우
        if (start == null) {
            start = new Node();
            start.data = x;
        }
        // 만약 데이터가 있는 경우
        else {
            // 시작 노드부터 시작해서
            Node head = start;
            // 다음 노드가 없는 노드에 도달할 때 까지
            while(head.link != null) {
                head = head.link;
            }

            // 새 노드를 만들고
            Node newNode = new Node();
            newNode.data = x;
            // 그 노드를 끝에 할당해준다.
            head.link = newNode;
        }
    }

    // 데이터를 중간에 추가하는 add
    public void add(int idx, int x) {
        // 데이터를 넣는곳의 앞쪽 노드
        Node prev = start;
        // 데이터를 넣는곳의 뒤쪽 노드
        Node next = start;
        // 몇번째 데이터인지 확인하기 위한
        int i = 0;
        // i가 넣을 곳보다 작을동안 반복해서
        while (i < idx) {
            // 현재 노드를 앞쪽 노드로 할당하고
            prev = next;
            // 다음 노드를 현재 노드로 바꿔준다.
            next = next.link;
            i++;
        }
        // 새로운 데이터를 만들고
        Node newNode = new Node();
        newNode.data = x;
        // 앞쪽 노드에 연결
        prev.link = newNode;
        // 뒤쪽 노드에 연결
        newNode.link = next;
    }

    public void addFirst(int x) {
        Node newNode = new Node();
        newNode.data = x;
        newNode.link = start;
        start = newNode;
    }

    // 데이터를 중간에서 제거하는 remove
    public int remove(int idx) {
        if (idx == 0) {
            int value = start.data;
            start = start.link;
            return value;
        }
        // 데이터를 넣는곳의 앞쪽 노드
        Node prev = start;
        // 데이터를 넣는곳의 뒤쪽 노드
        Node next = start;
        // 몇번째 데이터인지 확인하기 위한
        int i = 0;
        // i가 넣을 곳보다 작을동안 반복해서
        while (i < idx) {
            // 현재 노드를 앞쪽 노드로 할당하고
            prev = next;
            // 다음 노드를 현재 노드로 바꿔준다.
            next = next.link;
            i++;
        }
        // 반복문이 끝나면 next가 돌려줄 데이터
        int value = next.data;
        // prev가 가리키던 노드를 next가 아니라 next가 가리키던 노드로
        prev.link = next.link;
        return value;
    }
}
