package programmers;

import java.util.HashMap;
import java.util.Map;

// https://school.programmers.co.kr/learn/courses/30/lessons/176963
public class Solution176963 {
    public int[] solution(
            String[] name,
            int[] yearning,
            String[][] photos
    ) {
        // 그리움 정도를 저장할 Map을 만들자.
        Map<String, Integer> yearnMap = new HashMap<>();
        // 이름과 점수를 확인해가며 yearnMap을 갱신하자.
        for (int i = 0; i < name.length; i++) {
            yearnMap.put(name[i], yearning[i]);
        }

        // 정답을 위한 배열
        int[] answer = new int[photos.length];
        // 각 사진을 확인하며 점수를 계산한다.
        for (int i = 0; i < photos.length; i++) {
            // 사진을 가져온다.
            String[] photo = photos[i];
            // 점수를 구하기 위한 변수
            int sum = 0;
            // 사진의 등장인물을 하나씩 확인하며
            // yearnMap에서 점수를 회수한다.
            for (String person : photo) {
                // 그립지 않은 사람이라면 0점으로 만든다.
                sum += yearnMap.getOrDefault(person, 0);
            }
            // 정답을 기록한다.
            answer[i] = sum;
        }
        return answer;
    }
}
