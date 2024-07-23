package c1basics;

import java.util.Arrays;


public class D5DeltaSearch {
    public static void main(String[] args) {
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
