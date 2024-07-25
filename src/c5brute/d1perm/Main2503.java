package c5brute.d1perm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/2503
public class Main2503 {
    public static void main(String[] args) throws IOException {
        // 만든 메서드 기능 테스트
        /*int[] target = {3, 2, 4};
        int[] select = {9, 2, 4};
        System.out.println(Arrays.toString(
                getCount(target, select)
        ));*/

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        // 몇번의 시도가 있는지
        int tries = Integer.parseInt(reader.readLine());
        // 시도한 숫자와, 그때의 카운트 정보
        int[][] countInfos = new int[tries][3];
        // 데이터를 입력받으면서 countInfos를 업데이트
        for (int i = 0; i < tries; i++) {
            String[] infoTokens = reader.readLine().split(" ");
            countInfos[i][0] = Integer.parseInt(infoTokens[0]);
            countInfos[i][1] = Integer.parseInt(infoTokens[1]);
            countInfos[i][2] = Integer.parseInt(infoTokens[2]);
        }

        // 정답 가능성이 있는 갯수를 파악하기 위한 변수
        int answers = 0;
        // 숫자를 반복하면서 테스트를 해본다.
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (j == i) continue;
                for (int k = 1; k < 10; k++) {
                    if (k == i || k == j) continue;
                    // 모든 시도와 숫자가 일치하는지를 파악하기 위해
                    // 실패 여부를 기록하는 변수를 준비한다.
                    boolean success = true;
                    // 정답의 가능성이 존재하는 숫자를 만들어 두자.
                    int[] target = new int[]{i, j, k};
                    // 각 시도마다 반복한다.
                    for (int t = 0; t < tries; t++) {
                        int select = countInfos[t][0];
                        int[] result = getCount(
                                target,
                                // 123 / 100 => 1, 123 / 10 => 12 => 2, 123 % 10 => 3
                                new int[]{select / 100, (select / 10) % 10, select % 10}
                        );
                        // 계산해본 결과와, 실제 결과가 다를 경우
                        if (result[0] != countInfos[t][1] || result[1] != countInfos[t][2]) {
                            // 실패했다.
                            success = false;
                            // 하나라도 실패하면 다음건 볼 필요 없다.
                            break;
                        }
                    }
                    // 모든 시도와 결과가 일치하면 정답의 갯수를 증가시킨다.
                    if (success) answers++;
                }
            }
        }
        System.out.println(answers);
    }

    // 324, 429를 배열로 넣어서
    // 1 1을 돌려주는 메서드
    private static int[] getCount(
            // 맞춰야되는 숫자
            int[] target,
            // 고른 숫자
            int[] select
    ) {
        // 스트라이크, 볼을 저장하기 위한 변수들
        int strikes = 0;
        int balls = 0;
        // 각 자리를 먼저 비교를 해보고,
        for (int i = 0; i < 3; i++) {
            // 자리와 값이 모두 일치
            if (target[i] == select[i]) strikes++;
            // 볼인지 확인
            else {
                for (int j = 0; j < 3; j++) {
                    // 값이라도 일치하는지 확인
                    if (target[j] == select[i]) balls++;
                }
            }
        }
        // 결과 돌려주기
        return new int[]{strikes, balls};
    }
}
