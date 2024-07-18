package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/15552
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader
                = new BufferedReader(new InputStreamReader(System.in));
        // test의 갯수를 입력받는다.
        int tests = Integer.parseInt(reader.readLine());
        // test의 갯수만큼 반복하면서
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < tests; i++) {
            // 한줄의 데이터를 입력받고
            String line = reader.readLine();
            // 해당 줄을 잘라서
            String[] tokens = line.split(" ");
            // 각각 숫자로 바꾼다음 더해준다.
            int sum = Integer.parseInt(tokens[0])
                    + Integer.parseInt(tokens[1]);
            answer.append(sum);
            answer.append('\n');
//            System.out.println(sum);
        }
        System.out.print(answer);
    }
}
