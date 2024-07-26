package c4queue.d3bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {
    public static void main(String[] args) {
        // 점의 갯수
        int nodes = 7;
        // 선의 정보
        String[] edges = {
                "1 2",
                "1 3",
                "2 4",
                "2 5",
                "3 7",
                "4 6",
                "5 6",
                "6 7"
        };
        // 각 점이 연결되어 있는지를 판단하는 방법
        //  adjMap[i][j] == 1 이면 i와 j가 연결되어 있다.
        int[][] adjMap = new int[nodes + 1][nodes + 1];

        // 1. 데이터 수집
        // 1-1. 주어진 edge 만큼 반복하며 edge를 찾는다.
        for (int i = 0; i < edges.length; i++) {
            // 6 7
            String edge = edges[i];
            // 1-2. edge에서 각 node 정보를 찾는다.
            // ["6", "7"]
            String[] edgeInfo = edge.split(" ");
            // left = Integer.parseInt("6");
            int left = Integer.parseInt(edgeInfo[0]);
            int right = Integer.parseInt(edgeInfo[1]);
            // 1-3. adjMap에 기록한다.
            adjMap[left][right] = 1;
            adjMap[right][left] = 1;
        }

        // 2. BFS 준비
        // 2-1. 다음 방문할 곳을 기록하기 위한 큐
        Queue<Integer> toVisit = new LinkedList<>();
        // 2-2. 방문한 사실을 기록하기 위한 배열
        boolean[] visited = new boolean[nodes + 1];
        // 2-3. 방문 순서를 기록하기 위한 리스트
        List<Integer> visitOrder = new ArrayList<>();

        // 3. BFS 시작
        // 3-1. 처음 방문할 곳을 toVisit에 추가
        toVisit.offer(6);
        // 3-2. toVisit가 텅빌 때 까지 반복한다.
        while (!toVisit.isEmpty()) {
            // 3-3. 다음 방문할 곳을 dequeue한다.
            int now = toVisit.poll();
            // 3-4. 방문 여부를 확인한다.
            if (visited[now]) {
                continue;
            }
            // 방문한적 없으면 방문했다 표시
//            visited[now] = true;
            // 3-5. 방문 순서를 기록한다.
//            visitOrder.add(now);
            // 3-6. 다음 방문 대상을 toVisit에 enqueue한다.
            for (int next = 1; next < nodes + 1; next++) {
                // 이미 방문한 곳은 enqueue하지 않고,
                if (visited[next]) continue;
                // 내가 연결된 곳만 toVisit에 enqueue한다.
//                if (adjMap[now][next] == 1) toVisit.offer(next);
                if (adjMap[now][next] == 1) {
                    // BFS는 방문할 순서를 큐에 기록하기 때문에
                    // 방문 가능한 순서대로 바로 방문했음을 기록할 수 있다.
                    toVisit.offer(next);
                    visited[next] = true;
                    visitOrder.add(next);
                }
            }
        }
        System.out.println(visitOrder);
    }
}











