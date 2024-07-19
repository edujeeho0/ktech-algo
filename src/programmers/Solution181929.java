package programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/181906
public class Solution181929 {
    public int solution(int[] num_list) {
        int[] numbers = num_list;
        // 총합을 구한다.
        // sum 변수를 만들고,
        int sum = 0;
        // numbers의 각 숫자마다 반복하면서
        for (int i = 0; i < numbers.length; i++) {
            // sum에 더한다.
            sum += numbers[i];
        }
        // sum을 제곱한다. (sum * sum)
        sum *= sum;

        // 곱을 구한다.
        // product 변수를 만들고
        int product = 1;
        // numbers의 각 숫자마다 반복하면서
        for (int i = 0; i < numbers.length; i++) {
            // product에 곱한다.
            product *= numbers[i];
        }

        // sum과 product를 비교하고 결과를 반환한다.
        return product < sum ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(new Solution181929()
                .solution(
                        new int[]{3, 4, 5, 2, 1}
                ));
    }
}
