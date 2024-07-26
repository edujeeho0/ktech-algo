package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/2563
public class Main2563 {
    public static void main(String[] args) throws IOException {
        // BufferedReader 만들기
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        // 색종이의 갯수를 받는다.
        int n = Integer.parseInt(reader.readLine());
        // 큰 종이를 나타내는 배열을 만들고,
        int[][] bigPaper = new int[100][100];

        // 색종이의 갯수만큼 반복해서
        for (int i = 0; i < n; i++) {
            // 색종이의 정보를 받는다.
            String[] leftUp = reader.readLine().split(" ");
            int x = Integer.parseInt(leftUp[0]);
            int y = Integer.parseInt(leftUp[1]);
            // 색종이는 왼쪽 위의 좌표를 나타내므로
            // 색종이의 x좌표부터 x + 10까지 반복하며
            for (int j = x; j < x + 10; j++) {
                // 색종이의 y좌표부터 y + 10까지 반복한다.
                for (int k = y; k < y + 10; k++) {
                    // 그 지점을 1로!
                    bigPaper[k][j] = 1;
                }
            }
        }

        // 다시 종이 전체를 확인하며 1을 센다.
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                sum += bigPaper[i][j];
            }
        }
        System.out.println(sum);
    }
}






