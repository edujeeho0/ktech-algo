package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/20001
public class Main20001 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        // 시작
        String line = reader.readLine();
        // 총 들어온 문제를 세는 변수
        int count = 0;
        while (true) {
            line = reader.readLine();
            if (line.equals("고무오리 디버깅 끝")) {
                break;
            }
            // 문제가 들어오면
            if (line.equals("문제")) {
                count++;
            }
            // 고무오리가 들어오고 문제가 있을 때
            else if (line.equals("고무오리") && count != 0) {
                // 문제를 풀어준다.
                count--;
            }
            // 고무오리가 왔지만 풀 문제가 없을 때
            else {
                count += 2;
            }
        }

        // count의 갯수에 따라 결과를 달리 출력한다.
        if (count == 0) {
            System.out.println("고무오리야 사랑해");
        } else {
            System.out.println("힝구");
        }
    }
}






