package dev.techieguy.warmup;

import java.math.BigDecimal;

public class RepeatedString {
    public static void main(String[] args) {
        System.out.println(solution2("a", 100000000000000000L));
    }

    static long solution(final String str, final long n) {
        int len = str.length();
        long mod = n % len;
        long div = n / len;
        String tailStr = mod != 0 ? str.substring(0, (int) mod) : "";
        final String text = repeat(str, div) + tailStr;
        long count = 0;
        for (int index = 0; index < text.length(); index++) {
            if (text.charAt(index) == 'a')
                count++;
        }
        return count;
    }
    // Stackoverflow exception coming at this line
    static String repeat(String str, long times) {
        if (times <= 0)
            return "";
        else
            return str + repeat(str, times - 1);
    }

    static long solution2 (final String s, final long n) {
        long count = 0;
        int len = s.length();
        long mul = n / len;
        long mod = n % len;
        long add = 0;
        for(int i = 0; i < len; i++) {
            if(i == mod && mod != 0)
                add = count;
            if(s.charAt(i) == 'a')
                count++;
        }
        count *= mul;
        count += add;
        return count;
    }
}
