package programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/181914
public class Solution181914 {
    public int solution(String number) {
        int sum = 0;
        char[] numChars = number.toCharArray();
        for (int i = 0; i < numChars.length; i ++) {
            sum += numChars[i] - '0';
        }
        return sum % 9;
    }

    public static void main(String[] args) {
        System.out.println(new Solution181914().solution("78720646226947352489"));
    }
}
