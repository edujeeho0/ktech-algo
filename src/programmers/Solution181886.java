package programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/181886
public class Solution181886 {
    public String[] solution(String[] names) {
        // answer 배열의 크기를 names 배열의 크기를 바탕으로 결정한다.
        // names.length / 5 의 크기만큼, 배열의 크기를 잡아준다.
        // names.length % 5 != 0 라면, 크기를 한칸 더 크게 해준다.
        int arrLen = names.length / 5;
        if (names.length % 5 != 0) arrLen++;
        String[] answer = new String[arrLen];
        // i를 5씩 키워가며 반복한다.
        // names.length 보다 작을 동안에
        for (int i = 0; i < names.length; i += 5) {
            // i == 0, 5, 10, 15, ...
            answer[i / 5] = names[i];
        }
        return answer;
    }
}
