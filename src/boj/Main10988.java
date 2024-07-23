package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/10988
public class Main10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader
                = new BufferedReader(new InputStreamReader(System.in));
        String isPalindrome = reader.readLine();
        int result = 1;
        // 양쪽을 비교하는 거기 때문에 길이의 절반만 반복해도 된다.
        for (int i = 0; i < isPalindrome.length() / 2; i++) {
            // 양쪽의 문자가 일치하지 않았다.
            if (isPalindrome.charAt(i) != isPalindrome.charAt(isPalindrome.length() - i - 1)) {
                // 한번이라도 일치하지 않으면 Palindrome이 아님
                result = 0;
                // 더이상 나머지를 확인할 필요가 없다.
                break;
            }
        }
        System.out.println(result);
    }
}






