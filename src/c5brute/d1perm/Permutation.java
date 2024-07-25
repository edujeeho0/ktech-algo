package c5brute.d1perm;

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
}
