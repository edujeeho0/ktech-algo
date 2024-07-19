package programmers;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/172928
public class Solution172928 {

    public int[] solution(
            // 공원 (이동할 영역)
            String[] parkStr,
            // 이동할 과정들
            String[] routes
    ) {
        // String[] -> char[][]
        char[][] park = new char[parkStr.length][];
        for (int i = 0; i < parkStr.length; i++) {
            park[i] = parkStr[i].toCharArray();
        }

        // 높이와 넓이를 먼저 구한다. (height, width);
        int height = park.length;
        int width = park[0].length;

        // 공원(park)를 살피면서
        int[] me = new int[2];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // 시작지점(S)를 찾는다.
                if (park[i][j] == 'S') {
                    me[0] = i;
                    me[1] = j;
                }
            }
        }

        // 델타 만들기
        int[][] deltas = {
                {-1, 0},  // N
                {1, 0},   // S
                {0, -1},  // W
                {0, 1}    // E
        };

        // routes의 각 route를 살펴본다.
        for (String route : routes) {
            // route의 방향에 따라 delta를 정하고,
            int[] delta;
            String[] info = route.split(" ");
            switch (info[0]) {
                case "N":
                    delta = deltas[0];
                    break;
                case "S":
                    delta = deltas[1];
                    break;
                case "W":
                    delta = deltas[2];
                    break;
                case "E":
                    delta = deltas[3];
                    break;
                default:
                    delta = null;
                    break;
            }
            // 1. 공원의 범위 내에 있는지 (도착 지점의 h, w가 0 이상, height, width 이하)
            int distance = Integer.parseInt(info[1]);
            // 1-1. 내가 조건대로 이동하면 도착하는 지점을 만들어 본다.
            int[] next = {
                    me[0] + delta[0] * distance,
                    me[1] + delta[1] * distance
            };
            // 1-2. 내 새로운 위치가 범위안에 없다면,
            if (!(
                    -1 < next[0] && next[0] < height &&
                    -1 < next[1] && next[1] < width
            )) continue;  // 명령을 이행하지 않는다.
            // 2. 범위 내에 있다면,
            next = new int[]{ me[0], me[1] };
            // 장애물이 있었는지 기록한다.
            boolean blocked = false;
            for (int i = 0; i < distance; i++) {
                // 해당 방향으로 한칸씩 이동해가며
                // X가 없음을 확인한다.
                next[0] += delta[0];
                next[1] += delta[1];
                if (park[next[0]][next[1]] == 'X') {
                    blocked = true;
                    break;
                }
            }
            // 막힌적이 없다면
            if (!blocked) {
                // 이동한다.
                me = next;
            }
        }


        return me;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution172928()
                .solution(
                        new String[]{"OSO","OOO","OXO","OOO"},
                        new String[]{"E 2","S 3","W 1"}
                )));

        // y 따로 x 따로 저장하는 방법
        int[] deltaY = {-1, 1, 0, 0};
        int[] deltaX = {0, 0, -1, 1};
        int[] me = {2, 3};
        for (int i = 0; i < 4; i++) {
            int[] now = {
                    me[0] + deltaY[i],
                    me[1] + deltaX[i]
            };
            System.out.println(Arrays.toString(now));
        }
        System.out.println();
        // deltas에 전부 저장하는 방법
        int[][] deltas = {
                {-1, 0},
                {1, 0},
                {0, -1},
                {0, 1}
        };
        System.out.println();
        for (int i = 0; i < 4; i++) {
            int[] delta = deltas[i];
            int[] now = {
                    me[0] + delta[0],
                    me[1] + delta[1]
            };
            System.out.println(Arrays.toString(now));
        }
        System.out.println();
        for (int[] delta: deltas) {
            int[] now = {
                    me[0] + delta[0],
                    me[1] + delta[1]
            };
            System.out.println(Arrays.toString(now));
        }
    }
}
