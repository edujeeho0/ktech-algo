package c1basics;

import java.util.Arrays;

public class D4MultiDimensional {
    public static void main(String[] args) {
        // 배열에 데이터 바로 넣기
        int[] odArray = { 1, 2, 3, 4, 5 };
        // 배열의 크기만 잡아주기
        odArray = new int[5];

        // 2차원 배열에 데이터 바로 넣기
        int[][] tdArray = {
                { 1, 2, 3 },   // int[]
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int[] row = tdArray[0];
        int cell = row[0];
        System.out.println(cell);

        cell = tdArray[0][0];
        System.out.println(cell);

        // 배열의 크기만 알고있다면?
        // 3 * 3 배열을 만들고 싶다
        tdArray = new int[3][3];
        tdArray[0][0] = 1;
        tdArray[1][1] = 2;
        tdArray[2][2] = 3;
        tdArray[2][1] = 9;
        /*
        tdArray = {
                { 1, 0, 0 },
                { 0, 2, 0 },
                { 0, 9, 3 }
        };
         */
        tdArray = new int[3][3];
        // 먼저, 다음에 넣을 숫자를 기록해둘 변수를 만든다.
        int count = 1;
        // 반복적으로 2차원 배열의 각 배열을 가져온다.
        for (int i = 0; i < 3; i++) {
            row = tdArray[i];
            // 가져온 배열을 앞에서부터 살펴보며
            for (int j = 0; j < 3; j++) {
                // 거기에 count를 넣고
                row[j] = count;
                // tdArray[i][j] = count;
                // count를 1 증가시킨다.
                count++;
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(tdArray[i]));
        }

        tdArray = new int[][]{
                {0, 1, 0, 1, 0},
                {0, 1, 0, 1, 0},
                {0, 0, 0, 0, 0},
        };
        // tdArray[0][0] -> tdArray[0][1]
        //        -> tdArray[1][0]
    }
}
