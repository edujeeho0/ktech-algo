package programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/181893
public class Solution181893 {
    public int[] solution(int[] arr, int[] query) {
        // Java에서는 배열을 쉽게 자르기 힘드니까
        // 포함된 오른쪽 끝 idx와 왼쪽 끝 idx를 저장하고
        // 주어진 값 만큼 이동시킨다.
        int left = 0;
        int right = arr.length;
        // query의 내용들을 반복해서 확인한다.
        for (int i = 0; i < query.length; i++) {
            // 짝수번째 i에서는
            if (i % 2 == 0) {
                // right의 크기를 left + query[i] + 1로 바꿔준다.
                right = left + query[i] + 1;
            }
            else {
                left += query[i];
            }
        }
        // right - left가 남은 배열의 크기다.
        int[] answer = new int[right - left];
        // 그 크기만큼 반복하면서
        for (int i = 0; i < right - left; i++) {
            // answer[i]에 left + i를 넣어준다.
            answer[i] = arr[left + i];
        }
        return answer;
    }
}
