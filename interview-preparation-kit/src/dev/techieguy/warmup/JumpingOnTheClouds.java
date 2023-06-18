package dev.techieguy.warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JumpingOnTheClouds {
    public static void main(String[] args) {
        System.out.println(solution(Arrays.asList(0, 0, 1, 0, 0, 1, 0)));
    }
    static int solution(final List<Integer> list) {
        int count = 0;
        for (int index = 0; index < list.size() - 1; index++) {
            if(index + 2 < list.size() && list.get(index + 2) == 0)
                index++;
            count++;
        }
        return count;
    }
}
