package programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/181920
public class Solution181920 {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num - start_num + 1];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = i + start_num;
        }
        return answer;
    }
}
