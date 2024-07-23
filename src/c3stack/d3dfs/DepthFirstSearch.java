package c3stack.d3dfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {
    public static void main(String[] args) {
        int nodes = 7;
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
        // 1. 이차원배열 int[][] adjMap
        //  adjMap[i][j] == 1 이면 i와 j가 연결되어 있다.
        int[][] adjMap = new int[nodes + 1][nodes + 1];
        // 2. 리스트 리스트 adjList
        //  i에 연결된 점들은 adjList.get(i)의 안에 있다.
        List<List<Integer>> adjList = new ArrayList<>();

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

        // 2. DFS 준비
        // 2-1. 다음 방문할 곳을 기록하기 위한 스택
        Stack<Integer> toVisit = new Stack<>();
        // 2-2. 방문했다는 사실을 기록하기 위한 배열
        boolean[] visited = new boolean[nodes + 1];
        // 2-3. 방문 순서를 기록하기 위한 리스트
        List<Integer> visitOrder = new ArrayList<>();

        // 3. DFS 시작
        // 3-1. 가장 먼저 방문할 곳을 toVisit에 추가
        toVisit.push(6);
        // 3-2. toVisit가 비어있을 때 까지 반복한다.
        while (!toVisit.empty()) {
            // 3-3. 다음 방문할 점을 pop 한다.
            int now = toVisit.pop();
            // 3-4. 방문 여부를 visited로 판단한다.
            if (visited[now]) {
                continue;
            }
            // 방문 한적 없으면 방문표시
            visited[now] = true;
            // 3-5. 방문 순서를 기록한다.
            visitOrder.add(now);
            // 3-6. 다음 방문 대상을 toVisit에 push한다.
            for (int next = nodes; next > 0; next--) {
                // 이미 방문한곳은 push 하지 않으며,
                if (visited[next]) continue;
                // 내가 연결된 곳만 push 한다.
                if (adjMap[now][next] == 1) toVisit.push(next);
            }
        }

        System.out.println(visitOrder);
    }
}
