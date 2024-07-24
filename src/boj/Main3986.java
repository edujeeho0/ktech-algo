package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// https://www.acmicpc.net/problem/3986
public class Main3986 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        // 테스트의 갯수
        int tests = Integer.parseInt(reader.readLine());
        // 좋은 단어의 갯수를 저장할 변수
        int goodWords = 0;
        // 테스트의 갯수만큼 반복한다.
        for (int i = 0; i < tests; i++) {
            // 단어를 입력받는다.
            String word = reader.readLine();
            // 글자가 짝이 맞는지 확인할 스택을 만든다.
            Stack<Character> charStack = new Stack<>();
            // 각 글자를 확인하며,
            // word.toCharArray() => char[]
            for (char c : word.toCharArray()) {
                // 스택이 비었거나, 제일 위의 글자가
                // 현재 글자와 다를때는 push
                if (charStack.empty() ||
                    charStack.peek() != c) charStack.push(c);
                // 스택의 제일 위의 글자가 나와 같으면 pop
                else if (charStack.peek() == c)
                    charStack.pop();
            }
            // 모든 글자를 살펴본 뒤 스택이 비어있다면 좋은 단어
            if (charStack.empty()) goodWords++;
        }

        System.out.println(goodWords);
    }
}






