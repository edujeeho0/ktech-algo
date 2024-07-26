package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// https://www.acmicpc.net/problem/4949
public class Main4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        StringBuilder answer = new StringBuilder();

        // 계속 반복한다.
        while (true) {
            // 입력을 받는다.
            String line = reader.readLine();
            // 입력받은 내용이 "." 이라면 반복을 종료한다.
            if (line.equals(".")) break;
            // 스택을 만들어 주자.
            Stack<Character> stack = new Stack<>();
            // 정상 괄호인지 판단하는 변수
            boolean isValid = true;

            // 입력받은 줄의 문자를 하나씩 확인하며
            for (char letter : line.toCharArray()) {
                // 여는 괄호는 그냥 스택에 넣고,
                if (letter == '(' || letter == '[') {
                    stack.push(letter);
                }
                // 닫는 괄호라면 스택의 가장 위쪽 글자를 확인한다.
                else if (letter == ')' || letter == ']') {
                    // 1. 스택이 비어있는 경우
                    if (stack.empty()) {
                        // 정상적인 괄호가 아니므로 이 줄의 확인을 중단한다.
                        isValid = false;
                        break;
                    }
                    // 2. 스택의 제일 위가 [ 면서 닫는 괄호도 ] 인 경우
                    else if (stack.peek() == '[' && letter == ']') {
                        // 정상 괄호임으로 pop한다.
                        stack.pop();
                    }
                    // 3. 스택의 제일 위가 ( 면서 닫는 괄호도 ) 인 경우
                    else if (stack.peek() == '(' && letter == ')') {
                        stack.pop();
                    }
                    // 4. 닫는 괄호와 여는 괄호가 맞지 않는 경우
                    else {
                        isValid = false;
                        break;
                    }
                }
            }

            // isValid가 true이면서 stack이 비어있을 경우 yes
            if (isValid && stack.empty()) {
//                System.out.println("yes");
                answer.append("yes");
            }
            // 아니면 no
            else {
//                System.out.println("no");
                answer.append("no");
            }
            answer.append('\n');
        }
        System.out.println(answer);
    }
}






