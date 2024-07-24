package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/10798
public class Main10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        // 모든 글자를 저장해두기 위한 2차원 배열
        char[][] letters = new char[5][];
        // 단어 길이의 최댓값을 저장해두기 위한 변수
        int maxLength = 0;
        // 다섯번 반복하면서 단어를 입력받는다.
        for (int i = 0; i < 5; i++) {
            letters[i] = reader.readLine()
                    .toCharArray();
            // 단어 길이를 비교해 최댓값을 구한다.
            maxLength = Math.max(letters[i].length, maxLength);
        }
        // 출력을 위한 StringBuilder
        StringBuilder answer = new StringBuilder();
        // maxLength 만큼 반복한다.
        for (int i = 0; i < maxLength; i++) {
            // 단어가 다섯개라서 다섯번 반복한다.
            for (int j = 0; j < 5; j++) {
                // 만약 현재 글자가 존재하면
                // (현재 확인하는 단어의 길이가 i 보다 크다면)
                if (!(i < letters[j].length)) continue;
                // 글자를 저장한다.
                answer.append(letters[j][i]);
            }
        }
        // 결과 출력
        System.out.println(answer);
    }
}






