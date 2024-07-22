package programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/181931
public class Solution181931 {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        // included의 길이만큼 반복하면서
        for (int i = 0; i < included.length; i++) {
            // 만약 included[i]의 값이 true일 경우
            if (included[i]) {
                // answer에 a를 더해준다.
                answer += a;
            }
            // 더했든 안했든 a를 d만큼 키워준다.
            a += d;
        }
        return answer;
    }
}
