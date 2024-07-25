package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// https://www.acmicpc.net/problem/10809
public class Main10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        // 확인하고싶은 단어
        String target = reader.readLine();
        // 각 글자가 몇번째에 처음 등장했는지 기록하는 배열
        int[] array = new int[26];
        // 일단 전부 -1로 만든다.
        /*for (int i = 0; i < 26; i++) {
            array[i] = -1;
        }*/
        Arrays.fill(array, -1);
        // 일단 각 글자를 0번째 부터 마지막 글자까지 살펴보는데,
        for (int i = 0; i < target.length(); i++) {
            // 글자가 'b'라면 그 글자는 'b' - 'a' 번째 글자이다.
            int index = target.charAt(i) - 'a';
            // 해당하는 array[index]의 값이 -1이면
            // i를 새로 넣어준다.
            if (array[index] == -1) {
                array[index] = i;
            }
        }

        // 결과 출력 준비
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            answer.append(array[i]);
            answer.append(' ');
        }
        System.out.println(answer);
    }
}






