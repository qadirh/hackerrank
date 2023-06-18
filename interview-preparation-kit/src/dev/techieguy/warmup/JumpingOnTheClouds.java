package dev.techieguy.warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JumpingOnTheClouds {
    public static void main(String[] args) {
        System.out.println(solution(Arrays.asList(0, 0)));
    }
    static int solution(final List<Integer> list) {
        int count = 0;
        int size = list.size();
        if (size >= 2 && size <= 100 && (list.contains(0) || list.contains(1)) && list.get(0) == 0 && list.get(size - 1) == 0) {
            System.out.println("Inside if condition");
            for (int index = 0; index < size - 1; index++) {
                if(index + 2 < size && list.get(index + 2) == 0)
                    index++;
                count++;
            }
        }
        return count;
    }
}
