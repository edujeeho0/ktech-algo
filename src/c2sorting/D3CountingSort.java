package c2sorting;

import java.util.Arrays;

public class D3CountingSort {
    // 각 데이터의 출현 횟수를 바탕으로
    // 정렬하는 Counting Sort
    public static void countingSort(int[] array) {
        // 원래는 max를 찾아야 하지만 스킵
        // 데이터 출현횟수 파악용 counts 생성
        int[] counts = new int[6];
        // array의 데이터를 순회하면서 counts 업데이트
        for (int data : array) {
            counts[data]++;
        }

        // counts의 뒤쪽 원소에 앞쪽 원소의 값을 더해준다. (누적합)
        for (int i = 0; i < counts.length - 1; i++) {
            counts[i + 1] += counts[i];
        }

        // 결과를 담아줄 배열을 만든다.
        int[] output = new int[array.length];
        // 뒤에서부터 array를 확인하며
        // counts[data] - 1의 위치에 넣어준다.
        for (int i = array.length - 1; i >= 0; i--) {
            // 이번 데이터의 counts를 줄여준다.
            counts[array[i]]--;
            // 다음에 넣을곳에 데이터를 넣어준다.
            int position = counts[array[i]];
            output[position] = array[i];
        }

        System.out.println(Arrays.toString(output));
    }

    public static void main(String[] args) {
        countingSort(new int[]{0, 2, 4, 4, 1, 0, 3, 4, 3, 1});
        countingSort(new int[]{0, 2, 4, 4, 5});
    }
}
