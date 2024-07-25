package c5brute.d2comb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/2798
public class Main2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String[] info = reader.readLine().split(" ");
        int cardCount = Integer.parseInt(info[0]);
        int score = Integer.parseInt(info[1]);

        // 카드를 받아주자.
        // 카드 정보를 저장할 배열을 만들자.
        int[] cards = new int[cardCount];
        // 카드 정보를 받아서 나눠두자
        String[] cardInfo = reader.readLine().split(" ");
        // 카드 정보를 정수로 바꿔 카드로 저장하자.
        for (int i = 0; i < cardCount; i++) {
            cards[i] = Integer.parseInt(cardInfo[i]);
        }

        // 최댓값을 저장하기 위한 변수
        int max = 0;
        // 3장만 고르기 때문에 3중 for를 사용
        for (int i = 0; i < cardCount - 2; i++) {
            for (int j = i + 1; j < cardCount - 1; j++) {
                for (int k = j + 1; k < cardCount; k++) {
                    // 이때, i, j, k는 몇번째 카드를
                    // 선택할지 결정하는 값이 된다.
                    // 그래서, 카드 세장의 총합을 구한다.
                    int sum = cards[i] + cards[j] + cards[k];
                    // 만약 목표 점수보다 작거나 같고,
                    // 현재 최댓값보다 크다면
                    if (sum <= score && sum > max) {
                        // 최댓값을 갱신해준다.
                        max = sum;
                    }
                }
            }
        }

        System.out.println(max);
    }
}
