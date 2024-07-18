package c1basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Scanner;

public class D3Input {
    public static String makeString(int n) {
        StringBuilder builder = new StringBuilder();
        // 1 1 1 1 1 1 1 1 1 1
        for (int i = 0; i < n; i++) {
            builder.append("1 ");
        }
        return builder.toString();
    }

    public static void bufferedReader(String line) throws IOException {
        BufferedReader reader = new BufferedReader(new StringReader(line));
        String[] tokens = reader.readLine().split(" ");
        for (int i = 0; i < tokens.length; i++) {
            Integer.parseInt(tokens[i]);
        }
    }

    public static void scannerReader(String line) {
        Scanner scanner = new Scanner(new StringReader(line));
        // scanner에 지급된 입력의 다음 단어가 있는지 반환하는 메서드
        while (scanner.hasNext()) {
            Integer.parseInt(scanner.next());
        }
    }

    public static void main(String[] args) throws IOException {
        int length = 10000;
        String testString = makeString(length);

        long startTime = System.nanoTime();
        scannerReader(testString);
        long endTime = System.nanoTime();
        System.out.println("Scanner: " + (endTime - startTime));

        startTime = System.nanoTime();
        bufferedReader(testString);
        endTime = System.nanoTime();
        System.out.println("BufferedReader: " + (endTime - startTime));
    }
}
