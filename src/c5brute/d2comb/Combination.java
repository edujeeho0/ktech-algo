package c5brute.d2comb;

public class Combination {
    public static void main(String[] args) {
        // nC3을 구한다고 가정을 하자.
        int n = 10;
        // 0 ~ n-1 사이의 숫자 중 3개를 고르는 모든 방법
        System.out.println("0 ~ n-1 사이의 숫자 중 3개를 고르는 모든 방법");
        for (int i = 0; i < n - 2; i++) {
            // i를 선택
            // 조합은 순서를 따지지 않기 때문에,
            // i를 골랐다면 j는 i 보다 커야된다.
            // j가 i보다 큰 경우들은 i가 해당 j 였을 때
            // 이미 고려가 된 경우이기 때문에
            for (int j = i + 1; j < n - 1; j++) {
                // k도 마찬가지로 j보다는 하나 더 커야한다.
                for (int k = j + 1; k < n; k++) {
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }
    }
}
