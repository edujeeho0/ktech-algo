package programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/181939
public class Solution181939 {
    public int solution(int a, int b) {
        // 1. 문자열 더하기
        String resultAStr = "" + a + b;
        String resultBStr = "" + b + a;

        /*// 2. String.format
        resultAStr = String.format("%d%d", a, b);

        // 3. StringBuilder
        StringBuilder bBuilder = new StringBuilder();
        bBuilder.append(b).append(a);
        resultBStr = bBuilder.toString();*/

        int resultA = Integer.parseInt(resultAStr);
        int resultB = Integer.parseInt(resultBStr);

        return Math.max(resultA, resultB);
    }

    public static void main(String[] args) {
        System.out.println(new Solution181939().solution(89, 8));
    }
}
