package c2sorting;

public class D4BinarySearch {
    // 탐색 범위를 절반씩 줄여가며
    // 내가 찾는 데이터를 확인하는 이진 탐색
    public static int binarySearch(
            // 대상 배열
            int[] array,
            // 찾고있는 숫자
            int target
    ) {
        // left와 right를 먼저 설정.
        int left = 0;
        int right = array.length - 1;

        // 언제까지 탐색할 것인가?
        // 왼쪽이 오른쪽보다 오른쪽에 있을 때
        // 범위가 소진되었을 때
        while (left <= right) {
            // 이번에 확인할 위치를 결정
            // 왼쪽에서 right와 left의 차이의 절반만큼
//            int mid = left + (right - left) / 2;
            int mid = (left + right) / 2;
            // mid의 데이터가 내가 찾던 데이터다.
            if (array[mid] == target) {
                // 탐색 성공
                return mid;
            }
            // 찾는 숫자가 mid의 데이터보다 작다.
            else if (array[mid] > target) {
                // right를 왼쪽으로 가져온다.
                right = mid - 1;
            }
            // 찾는 숫자가 mid의 데이터보다 크다.
            else if (array[mid] < target){
                left = mid + 1;
            }
        }
        // 탐색 실패
        return -1;
    }

    public static void main(String[] args) {
//        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] numbers = {3, 8, 10, 12, 15, 18, 19, 25, 29, 36, 41, 46, 49, 52, 59};
        System.out.println(binarySearch(numbers , 3));
    }
}
