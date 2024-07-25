package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// https://www.acmicpc.net/problem/1158
public class Main1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        // N과 K를 구한다.
        String[] info = reader.readLine().split(" ");
        int n = Integer.parseInt(info[0]);
        int k = Integer.parseInt(info[1]);

        // 결과를 저장할 리스트와,
        List<Integer> result = new ArrayList<>(n);
        // 사람들을 보관할 큐를 만든다.
        Queue<Integer> people = new LinkedList<>();
        // i명의 사람들을 people에 담는다.
        for (int i = 0; i < n; i++) {
            people.offer(i + 1);
        }

        // 몇번째 사람인지 (K번째인지 아닌지) 알기 위한 변수
        int round = 0;
        // 더이상 사람이 남지 않을때까지 반복한다.
        while (!people.isEmpty()) {
            // 제일 앞의 사람을 가져오고
            int person = people.poll();
            // 이번 사람은 빼야된다.
            if (round == k - 1) {
                result.add(person);
                round = 0;
            }
            // 이번 사람은 안빼도 된다.
            else {
                people.offer(person);
                round++;
            }
        }

        StringBuilder answer = new StringBuilder();
        answer.append('<');
        String resultString = result.toString();
        answer.append(resultString, 1, resultString.length() - 1);
        answer.append('>');
        System.out.println(answer);
    }
}






