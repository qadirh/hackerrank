package dev.techieguy.array;

import java.util.Scanner;

public class Array2D {

    private static final int NUMBER_OF_LINES = 6;
    private static int array[][]   = new int[NUMBER_OF_LINES][NUMBER_OF_LINES];
    private static Scanner input   = new Scanner(System.in);
    private static int result      = 0;
    private static String line;
    private static String arrayLine[];
    private static int temp;

    public static void main(String[] args) {

        for(int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                temp = calculateHourGlass(array, i, j);
            }
        }
    }

    private static int calculateHourGlass(int[][] array, int i, int j) {

    }
}
