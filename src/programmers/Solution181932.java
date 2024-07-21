package programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/181932
public class Solution181932 {
    public String solution(String code) {
        StringBuilder answerBuilder = new StringBuilder();
        // mode를 기록한 다음
        int mode = '0';
        // code의 각 글자를 확인해가면서
        for(int i = 0; i < code.length(); i++) {
            char letter = code.charAt(i);
            // 글자가 1이면 mode 변경
            if (letter == '1') mode = '1' - mode + '0';
            // mode가 0일때는 짝수번째 글자들을
            // mode가 1일때는 홀수번째 글자들을
            // answer에다가 추가해준다.
            else if (i % 2 == mode - '0') {
                answerBuilder.append(letter);
            }
        }
        String answer = answerBuilder.toString();
        return answer.isEmpty() ? "EMPTY" : answer.toString();
    }
}
