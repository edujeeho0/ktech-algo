package c3stack.d1stack;

import java.util.ArrayList;
import java.util.List;

// int 데이터를 Stack의 형태로 관리하는 클래스를 만들어보자.
public class MyStack {
    // 실제로 내부에 데이터를 저장할 공간
    private final int[] arr = new int[16];
    // 현재 스택의 꼭대기
    private int top = -1;
    // top == 0 이면, arr[0]에 Stack의 마지막으로 들어간 데이터가 존재한다.

    // 데이터를 넣기 위한 기능
    // push
    public void push(int x) {
        if (top == arr.length - 1) {
            throw new RuntimeException("stack is full");
        }
        top++;
        arr[top] = x;
    }

    // 데이터를 가져오기 위한 기능
    // pop
    public int pop() {
        int value = arr[top];
        top--;
        return value;
    }

    // 스택이 비어있는지 확인하는 기능
    public boolean isEmpty() {
        return top == -1;
    }
}
