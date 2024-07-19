package programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/181929
public class Solution181906 {
    public int solution(String myString, String isPrefix) {
        // isPrefix가 myString보다 길면 0을 반환한다.
        if (isPrefix.length() > myString.length())
            return 0;
        // isPrefix의 길이만큼 반복한다.
        for (int i = 0; i < isPrefix.length(); i++) {
            // isPrefix의 i번째 글자와
            // myString의 i번째 글자가 동일한지 확인
            // 동일하지 않다면 0을 반환한다.
            if (myString.charAt(i) != isPrefix.charAt(i))
                return 0;
        }

        // 반복문이 정상적으로 종료되면 1을 반환한다.
        return 1;


        // 한줄짜리
        // return myString.startsWith(isPrefix) ? 1 : 0;
    }
}
