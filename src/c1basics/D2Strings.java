package c1basics;

public class D2Strings {
    public String solution(String str1, String str2) {
        // 문자열 덧샘은 계산할때마다 새로운 문자열을 만든다(느리다)
        // 대신 StringBuilder를 사용한다.
        StringBuilder answer = new StringBuilder();
        // StringBuilder는 + 대신 append 메서드를 사용한다.
        for (int i = 0; i < str1.length(); i++) {
            answer.append(str1.charAt(i));
            answer.append(str2.charAt(i));
        }
        return answer.toString();
    }


    // aaaaa, bbbbb -> ababababab
    public String solution1(String str1, String str2) {
        // 방법 1: toCharArray() -> 문자열을 char[]로 바꾸는 메서드
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        String answer = "";
        for (int i = 0; i < chars1.length; i++) {
            answer += chars1[i];
            answer += chars2[i];
        }

        // 방법 2: charAt(int i) -> 문자열의 i번째 문자를 가져오는 메서드
        answer = "";
        for (int i = 0; i < str1.length(); i++) {
            answer += str1.charAt(i);
            answer += str2.charAt(i);
        }

        return answer;
    }
}
