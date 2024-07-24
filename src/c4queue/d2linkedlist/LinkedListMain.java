package c4queue.d2linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        linkedList.add(1, 25);
        linkedList.add(3, 35);

        System.out.println(linkedList.remove(0));
        System.out.println(linkedList.remove(0));
        System.out.println(linkedList.remove(0));
        System.out.println(linkedList.remove(0));
        System.out.println(linkedList.remove(0));
    }
}
