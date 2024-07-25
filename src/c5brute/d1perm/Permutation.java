package c5brute.d1perm;

import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        int[] data = { 4, 5, 6 };

        // 0 부터 2 사이의 3개의 숫자를 나열하는 모든 방법들
        System.out.println("0 ~ 2의 숫자 중 3개를 나열하는 방법들");
        // 0 부터 2 사이의 숫자중 하나를 선택한다.
        for (int i = 0; i < 3; i++) {
            // i가 선택된 숫자다.
            // 다음 숫자를 고른다.
            for (int j = 0; j < 3; j++) {
                // 이미 선택되었으면 넘어간다.
                if (i == j) continue;
                // j가 선택된 숫자다.
                // 다음 숫자를 고른다.
                for (int k = 0; k < 3; k++) {
                    // 앞에서 이미 선택되었으면 넘어간다.
                    if (k == i || k == j) continue;
                    System.out.println(i + " " + j + " " + k);
//                    System.out.println(data[i] + " " + data[j] + " " + data[k]);
                }
            }
        }

        // 0 부터 9 사이의 숫자 중 3개를 골라서 나열하는 모든 방법들
        System.out.println("0 ~ 9 사이의 숫자 중 3개를 골라서 나열하는 모든 방법들");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                // 이미 선택한건 스킵
                if (j == i) continue;
                for (int k = 0; k < 10; k++) {
                    // 앞에서 선택했던건 다 스킵
                    if (k == i || k == j) continue;
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }

        System.out.println("숫자야구 경우의 수");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                // 이미 선택한건 스킵
                if (j == i) continue;
                for (int k = 1; k < 10; k++) {
                    // 앞에서 선택했던건 다 스킵
                    if (k == i || k == j) continue;
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }
    }

    // nPr을 구하는 메서드
    // 0 부터 n - 1 사이의 숫자 중
    // r개를 골라서 나열하는 메서드
    public void permutation(
            // nPr
            int n, int r) {
        int[] perm = new int[r];
        boolean[] used = new boolean[n];
        permRecursive(n, r, 0, perm, used);
    }

    private void permRecursive(
            int n, int r,
            // 몇번째 원소를 골랐는지 표시하는 변수
            int k,
            // 현재 만들고 있는 순열을 저장할 변수
            int[] perm,
            // 사용한 숫자를 판단할 배열
            boolean[] used
    ) {
        if (k == r) {
            System.out.println(Arrays.toString(perm));
            return;
        }
        // 숫자를 0 ~ n-1 까지 살펴본다.
        for (int i = 0; i < n; i++) {
            // i가 이미 사용되었으면 건너뛴다.
            if (used[i]) continue;
            // 이번에 선택한 결과(i)를
            // 내가 만들고 있는 순열의 k에 추가한다.
            perm[k] = i;
            // 사용했다고 기록
            used[i] = true;
            // 다음 숫자를 고르라고 재귀호출한다.
            permRecursive(n, r, k + 1, perm, used);
            // 재귀호출이 끝나면, 사용했던 숫자를 반납한다.
            used[i] = false;
        }
    }
}
