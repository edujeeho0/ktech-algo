package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/3003
public class Main3003 {
    public static void main(String[] args) throws IOException {
        // 한줄의 문자열을 입력받고
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String line = reader.readLine();
        // 공백 기준으로 문자열을 나눈 다음
        String[] tokens = line.split(" ");
        int[] pieces = new int[6];
        // 각각 문자를 반복해서
        for (int i = 0; i < tokens.length; i++) {
            // 정수로 바꾸어서 저장한다.
            pieces[i] = Integer.parseInt(tokens[i]);
        }

        // 기준 숫자 목록과 각각 비교해서 1 1 2 2 2 8
        int[] baseCount = {1, 1, 2, 2, 2, 8};
        for (int i = 0; i < baseCount.length; i++) {
            // 차이를 기록한다.
            baseCount[i] -= pieces[i];
        }

        // 결과를 정리하여 출력한다.
        System.out.println(String.format(
                "%d %d %d %d %d %d",
                baseCount[0],
                baseCount[1],
                baseCount[2],
                baseCount[3],
                baseCount[4],
                baseCount[5]
        ));
    }
}
