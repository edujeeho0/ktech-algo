package c2sorting;

import java.util.Arrays;

public class D2SelectionSort {
    // 가장 작은 원소를 찾아서
    // 가장 앞의 원소와 교환
    // 하는 과정을 반복한다.
    public static void selectionSort(int[] array) {
        int length = array.length;
        // length - 1 만큼 반복하면서
        for (int i = 0; i < length - 1; i++) {
            // i 부터 length - 1 까지의 원소들
            // 중 최솟값을 찾는다.
            int minIdx = i;
            for (int j = i; j < length; j++) {
                if (array[j] < array[minIdx]) {
                    minIdx = j;
                }
            }
            // 최솟값과 제일 앞의 원소를 교환한다.
            int temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;

            System.out.println("rep " + i + ": " + Arrays.toString(array));
        }
    }

    // 가장 작은 원소와 원소의 위치를 찾는 방법?
    public static void minInArray(int[] array) {
        // 최솟값과 index를 저장할 변수를 만들고,
        // 첫번째 원소를 최솟값이라 가정하자.
        // int min = array[0];
        int minIdx = 0;
        // 원소의 길이만큼 반복하면서
        for (int i = 0; i < array.length; i++) {
            // 만약 array[i]가 min 보다 작으면
            if (array[i] < array[minIdx]) {
                // 기록한다.
                // min = array[i];
                minIdx = i;
            }
        }

        System.out.println("Min Value: " + array[minIdx]);
        System.out.println("Min Index: " + minIdx);
    }

    public static void main(String[] args) {
//        minInArray(new int[]{4, 2, 5, 3, 10, 7});
        int[] nums = {25, 12, 18, 24, 2, 21, 10, 11, 42, 31, 7, 9};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
