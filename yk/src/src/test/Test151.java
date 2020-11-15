package test;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test151 {
    public static void main(String[] args) {
        String s = "Hello world";
        System.out.println(reverseWords(s));

    }

    public static String reverseWords(String s) {
        int left = 0, right = s.length() - 1;
        while (left <= right && s.charAt(left) == ' ') {
            ++left;
        }

        while (left <= right && s.charAt(right) == ' ') {
            --right;
        }


        Deque<String> d = new ArrayDeque<String>();
        StringBuilder word = new StringBuilder();

        while (left <= right) {
            char c = s.charAt(left);
            if ((word.length() != 0) && (c == ' ')) {

                d.offerFirst(word.toString());
                word.setLength(0);
            } else if (c != ' ') {
                word.append(c);
            }
            ++left;
        }
        d.offerFirst(word.toString());


        return String.join(" ", d);

    }
}

