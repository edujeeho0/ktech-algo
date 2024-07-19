package programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/181883
public class Solution181932 {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        // mode를 기록한 다음
        // code의 각 글자를 확인해가면서
            // mode가 0일때는 짝수번째 글자들을
            // mode가 1일때는 홀수번째 글자들을
            // answer에다가 추가해준다.

        return answer.isEmpty() ? "EMPTY" : answer.toString();
    }
}
