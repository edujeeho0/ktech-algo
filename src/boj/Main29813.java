package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// https://www.acmicpc.net/problem/29813
public class Main29813 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        // 학생과 학번을 저장할 큐를 각각 만든다.
        Queue<String> names = new LinkedList<>();
        Queue<Integer> years = new LinkedList<>();

        // 데이터를 읽어서 각 큐를 채워준다.
        for (int i = 0; i < n; i++) {
            String[] studentInfo = reader.readLine().split(" ");
            names.offer(studentInfo[0]);
            years.offer(Integer.parseInt(studentInfo[1]));
        }

        // 두 큐에 데이터가 하나만 남을때까지 진행한다.
        while (names.size() > 1 && years.size() > 1) {
            // 제일 앞에 선 사람을 뽑아온다.
            names.poll();
            int year = years.poll();
            // year - 1 만큼 반복해서
            for (int i = 0; i < year - 1; i++) {
                // 사람과 학번을 빼고 다시 큐에 넣는다.
                names.offer(names.poll());
                years.offer(years.poll());
            }
            // 다음에 나오는 사람이 팀원이 된다.
            names.poll();
            years.poll();
        }

        // 마지막 남은 한사람을 출력한다.
        System.out.println(names.poll());
    }
}






